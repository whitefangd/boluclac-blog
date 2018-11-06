/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.database.services;

import java.util.List;

import com.boluclac.blog.database.entities.MstLanguage;

/**
 * config service.<br>
 * load data from DB for config logic
 * 
 * @author boluclac
 *
 */
public interface ConfigService {

    /**
     * get languages from DB.
     * 
     * @return languages.
     */
    List<MstLanguage> selectLanguages();

}
