/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.api.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * Configure resources security.
 * 
 * @author boluclac
 *
 */
@Configuration
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    /** Security configure logic. */
    @Autowired
    private SecurityConfigLogic logic;

    /**
     * configure HTTP security.
     * 
     * @param http
     *            security HTTP
     */
    @Override
    public void configure(final HttpSecurity http) throws Exception {

        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry security = http.authorizeRequests();
        security = logic.configureUrl(security);
        security.anyRequest().denyAll();
    }
}
