/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.api.config.security;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.boluclac.blog.common.global.BoConst;
import com.boluclac.blog.common.global.BoConst.UrlType;
import com.boluclac.blog.database.entities.LinkApiLinkRole;
import com.boluclac.blog.database.entities.MstApiLink;
import com.boluclac.blog.database.entities.MstRole;
import com.boluclac.blog.database.repositories.MstApiLinkRepository;

/**
 * Security configure logic.
 * 
 * @author boluclac
 *
 */
@Component
@Transactional
public class SecurityConfigLogic {

    /** table mst_api_link repository. */
    @Autowired
    private MstApiLinkRepository apiLinkRepository;

    /**
     * configure URL with role can access URL.
     * 
     * @param security
     *            HTTP security
     * @return HTTP security
     */
    public ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry configureUrl(
            final ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry security) {

        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry httpSecurity = security;

        List<MstApiLink> apiLinks = apiLinkRepository.findByDelFlag(false);
        if (!CollectionUtils.isEmpty(apiLinks)) {
            for (MstApiLink apiLink : apiLinks) {
                if (UrlType.ACCESS_ALL == apiLink.getUrlType()) {
                    httpSecurity.antMatchers(apiLink.getUrl()).permitAll();
                } else if (UrlType.ACCESS_ANONYMOUS == apiLink.getUrlType()) {
                    httpSecurity.antMatchers(apiLink.getUrl()).anonymous();
                } else if (UrlType.ACCESS_AUTHENTICATE == apiLink.getUrlType()) {
                    if (!CollectionUtils.isEmpty(apiLink.getLinkApiLinkRoles())) {
                        httpSecurity = httpSecurity.antMatchers(apiLink.getUrl()).denyAll();
                    } else {
                        Set<LinkApiLinkRole> roles = apiLink.getLinkApiLinkRoles();
                        String[] roleList = new String[roles.size()];
                        int index = 0;
                        for (LinkApiLinkRole linkRole : roles) {
                            MstRole role = linkRole.getMstRole();
                            roleList[index] = BoConst.PREFIX_ROLE + role.getValue();
                            index++;
                        }
                        httpSecurity = httpSecurity.antMatchers(apiLink.getUrl()).hasAnyRole(roleList);
                    }
                }
            }
        }

        return httpSecurity;
    }

}
