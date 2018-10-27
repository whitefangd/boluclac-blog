/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.database.servicesimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boluclac.blog.database.entities.Language;
import com.boluclac.blog.database.repositories.LanguageRepository;
import com.boluclac.blog.database.services.ConfigService;

/**
 * Implement of config service.
 * 
 * @author boluclac
 *
 */
@Service
public class ConfigServiceImp implements ConfigService {

    /** table languages repository. */
     @Autowired
     private LanguageRepository languagesRepository;

    @Override
    public final List<Language> selectLanguages() {

         return languagesRepository.findByDelFlag(false);
    }

}
