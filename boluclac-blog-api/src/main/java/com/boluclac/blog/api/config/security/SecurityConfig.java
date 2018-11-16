/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.api.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Security Configuration.
 * 
 * @author boluclac
 *
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /** user detail service. */
    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected final void configure(final AuthenticationManagerBuilder auth)
            throws Exception {

        auth.userDetailsService(userDetailsService);
    }

    /**
     * Bean authentication Manager.
     * 
     * @return Bean
     */
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean()
            throws Exception {

        return super.authenticationManagerBean();
    }
}
