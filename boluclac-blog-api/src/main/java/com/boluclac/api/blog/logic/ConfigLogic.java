/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.api.blog.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.boluclac.api.blog.result.LanguageResult;

/**
 * Logic get configuration for client.<br>
 * Logic will control transaction when access Database
 * 
 * @author boluclac
 *
 */
@Component
public class ConfigLogic {

    /**
     * generate languages.
     * 
     * @return languages
     */
    public List<LanguageResult> generateLanguages() {

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
