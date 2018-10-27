/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.api.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.boluclac.blog.api.result.LanguageResult;
import com.boluclac.blog.database.entities.Language;
import com.boluclac.blog.database.services.ConfigService;

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
    @Autowired
    private ConfigService service;

    /**
     * generate languages.
     * 
     * @return languages
     */
    public List<LanguageResult> generateLanguages() {

        List<Language> languageDatas = service.selectLanguages();
        List<LanguageResult> languages = new ArrayList<>();

        for (Language language : languageDatas) {
            LanguageResult languageResult = new LanguageResult();
            languageResult.setValue(language.getValue());
            languageResult.setText(language.getText());
            languages.add(languageResult);
        }
        return languages;
    }

}
