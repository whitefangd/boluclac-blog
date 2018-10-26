/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * Web API configuration.
 * 
 * @author boluclac
 *
 */
@Configuration
@ComponentScan({"com.boluclac.api.blog"})
public class BoLucLacBlogApiConfig implements WebMvcConfigurer {

    /**
     * configuration JACKSON to JSON. configure automatic convert response to
     * JSON data.
     *
     * @return view data is {@link View}
     */
    @Bean
    public View jsonTemplate() {

        MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setPrettyPrint(true);
        return view;
    }
}
