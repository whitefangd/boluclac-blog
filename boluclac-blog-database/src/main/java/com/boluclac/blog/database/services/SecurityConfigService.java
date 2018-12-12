/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.database.services;

import java.util.List;

import com.boluclac.blog.database.entities.MstApiLink;

/**
 * security configure service.<br>
 * load data from DB for security configure logic
 * 
 * @author boluclac
 *
 */
public interface SecurityConfigService {

    /**
     * select master API link.
     * 
     * @return mst_api_link list
     */
    List<MstApiLink> selectApiLink();

    /**
     * select master role.
     * 
     * @return mst_role list
     */
    String[] selectRoles();

}
