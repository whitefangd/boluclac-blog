/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.database.repositories;

import java.util.List;

import com.boluclac.blog.database.entities.MstRole;
import com.boluclac.blog.database.repositories.base.MstRoleBaseRepository;

/**
 * table mst_role repository.
 * 
 * @author boluclac
 *
 */
public interface MstRoleRepository extends MstRoleBaseRepository {

    /**
     * find by delete flag.
     * 
     * @param delFlag
     *            delete flag.
     * @return API links
     */
    List<MstRole> findValueByDelFlag(boolean delFlag);

}
