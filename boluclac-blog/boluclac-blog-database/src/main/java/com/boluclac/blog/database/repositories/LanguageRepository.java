/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.database.repositories;

import java.util.List;

import com.boluclac.blog.database.entities.Language;
import com.boluclac.blog.database.repositories.base.LanguageBaseRepository;

/**
 * table languages repository.
 * 
 * @author boluclac
 *
 */
public interface LanguageRepository extends LanguageBaseRepository {

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
    List<Language> findByDelFlag(boolean delFlag);

}
