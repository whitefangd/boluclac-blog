/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.database.repositories;

import java.util.List;

import com.boluclac.blog.database.entities.MstApiLink;
import com.boluclac.blog.database.repositories.base.MstApiLinkBaseRepository;

/**
 * table mst_api_link repository.
 * 
 * @author boluclac
 *
 */
public interface MstApiLinkRepository extends MstApiLinkBaseRepository {

    /**
     * find by delete flag.
     * 
     * @param delFlag
     *            delete flag.
     * @return API links
     */
    List<MstApiLink> findByDelFlag(boolean delFlag);

}
