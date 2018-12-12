/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.database.servicesimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boluclac.blog.database.entities.MstApiLink;
import com.boluclac.blog.database.entities.MstRole;
import com.boluclac.blog.database.repositories.MstApiLinkRepository;
import com.boluclac.blog.database.repositories.MstRoleRepository;
import com.boluclac.blog.database.services.SecurityConfigService;

/**
 * Implement of Security Config service.
 * 
 * @author boluclac
 *
 */
@Service
public class SecurityConfigServiceImpl implements SecurityConfigService {

    /** table mst_api_link repository. */
    @Autowired
    private MstApiLinkRepository apiLinkRepository;

    /** table mst_api_link repository. */
    @Autowired
    private MstRoleRepository mstRoleRepository;

    /**
     * select master API link.
     * 
     * @return mst_api_link list
     */
    @Override
    public List<MstApiLink> selectApiLink() {

        return apiLinkRepository.findByDelFlag(false);
    }

    /**
     * select master role.
     * 
     * @return mst_role list
     */
    @Override
    public String[] selectRoles() {

        List<MstRole> mstRoles = mstRoleRepository.findValueByDelFlag(false);
        return mstRoles.stream().map(role -> role.getValue()).collect(Collectors.toList()).toArray(new String[mstRoles.size()]);
    }

}
