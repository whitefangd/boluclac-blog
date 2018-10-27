/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.api.result;

import org.apache.commons.lang3.StringUtils;

/**
 * Language Result.
 * 
 * @author boluclac
 *
 */
public class LanguageResult {

    /** language value. */
    private String value = StringUtils.EMPTY;

    /** language text display. */
    private String text = StringUtils.EMPTY;

    /**
     * get language value.
     * 
     * @return the language value.
     */
    public String getValue() {

        return value;
    }

    /**
     * set language value.
     * 
     * @param value
     *            the language value to set
     */
    public void setValue(final String value) {

        this.value = value;
    }

    /**
     * get language text display.
     * 
     * @return the language text display.
     */
    public String getText() {

        return text;
    }

    /**
     * set language text display.
     * 
     * @param text
     *            the language text display to set
     */
    public void setText(final String text) {

        this.text = text;
    }
}
