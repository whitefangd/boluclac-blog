/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.database.repositories;

import java.util.List;

import com.boluclac.blog.database.entities.MstLanguage;
import com.boluclac.blog.database.repositories.base.MstLanguageBaseRepository;

/**
 * table languages repository.
 * 
 * @author boluclac
 *
 */
public interface MstLanguageRepository extends MstLanguageBaseRepository {

    /**
     * find data by field DelFlag.
     * 
     * @param delFlag
     *            <ul>
     *            <li>{@link Boolean#TRUE} : record is deleted</li>
     *            <li>{@link Boolean#FALSE} : record isn't deleted</li>
     *            </ul>
     * @return list languages is {@link List} of {@link Languages}
     */
    List<MstLanguage> findByDelFlag(boolean delFlag);

}
