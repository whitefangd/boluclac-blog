/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.api.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Applicatio starter.
 * 
 * @author boluclac
 *
 */
@SpringBootApplication
public class BoluclacBlogApiApplication {

    /**
     * main starter.
     * 
     * @param args
     *            param console
     */
    public static void main(final String[] args) {

        SpringApplication.run(BoluclacBlogApiApplication.class, args);
    }

    /**
     * Constructor.
     */
    public void skipCheckStyle() {

        // Function for skip checkstyle.
    }
}
