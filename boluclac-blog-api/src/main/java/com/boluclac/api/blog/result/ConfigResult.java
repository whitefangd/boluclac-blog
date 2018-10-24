/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.api.blog.result;

import java.util.ArrayList;
import java.util.List;

/**
 * Configuration result.
 * 
 * @author boluclac
 *
 */
public class ConfigResult extends BaseResult {

    /** List languages. */
    private List<LanguageResult> languages = new ArrayList<>();

    /**
     * get list languages.
     * 
     * @return the list languages.
     */
    public List<LanguageResult> getLanguages() {

        return languages;
    }

    /**
     * set list languages.
     * 
     * @param languages
     *            the list languages to set
     */
    public void setLanguages(final List<LanguageResult> languages) {

        this.languages = languages;
    }
}
