/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.database.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boluclac.blog.database.entities.MstLanguage;
import com.boluclac.blog.database.repositories.MstLanguageRepository;
import com.boluclac.blog.database.services.ConfigService;

/**
 * Implement of config service.
 * 
 * @author boluclac
 *
 */
@Service
public class ConfigServiceImpl implements ConfigService {

    /** table languages repository. */
    @Autowired
    private MstLanguageRepository languagesRepository;

    @Override
    public final List<MstLanguage> selectLanguages() {

        return languagesRepository.findByDelFlag(false);
    }

}
