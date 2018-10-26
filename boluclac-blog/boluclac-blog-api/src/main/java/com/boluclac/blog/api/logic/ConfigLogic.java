/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.api.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.boluclac.blog.api.result.LanguageResult;

/**
 * Logic get configuration for client.<br>
 * Logic will control transaction when access Database
 * 
 * @author boluclac
 *
 */
@Component
@Transactional
public class ConfigLogic {
    
    /** config service. */
//    @Autowired
//    private ConfigService service;

    /**
     * generate languages.
     * 
     * @return languages
     */
    public List<LanguageResult> generateLanguages() {
        
//        service.selectLanguages();

        List<LanguageResult> languages = new ArrayList<>();

        LanguageResult languageVi = new LanguageResult();
        LanguageResult languageEn = new LanguageResult();

        languageVi.setValue("vi-vn");
        languageVi.setText("languages.vi");
        languageEn.setValue("en-us");
        languageEn.setText("languages.en");

        languages.add(languageVi);
        languages.add(languageEn);
        return languages;
    }
}
