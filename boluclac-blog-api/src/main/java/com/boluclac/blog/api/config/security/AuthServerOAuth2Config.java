/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.api.config.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

/**
 * configure Security OAuth2.
 * 
 * @author boluclac
 *
 */
@Configuration
@EnableAuthorizationServer
public class AuthServerOAuth2Config extends AuthorizationServerConfigurerAdapter {

    /** authentication management. */
    @Autowired
    @Qualifier("authenticationManagerBean")
    private AuthenticationManager authenticationManager;

    /** data sources. */
    @Autowired
    private DataSource dataSource;

    /**
     * Configure function check authentication.
     * 
     * @param oauthServer
     *            authentication server
     */
    @Override
    public void configure(
            final AuthorizationServerSecurityConfigurer oauthServer)
            throws Exception {

        oauthServer
                .tokenKeyAccess("permitAll()")
                .checkTokenAccess("isAuthenticated()");
    }

    /**
     * Configure data sources for token store.
     * 
     * @param clients
     *            client detail service
     */
    @Override
    public void configure(final ClientDetailsServiceConfigurer clients)
            throws Exception {

        clients.jdbc(dataSource);
    }

    /**
     * Configure end point. token store and authentication manager
     * 
     * @param endpoints
     *            end points
     */
    @Override
    public void configure(
            final AuthorizationServerEndpointsConfigurer endpoints)
            throws Exception {

        endpoints
                .tokenStore(tokenStore())
                .authenticationManager(authenticationManager);
    }

    /**
     * token store bean.
     * 
     * @return Token store bean.
     */
    @Bean
    public TokenStore tokenStore() {

        return new JdbcTokenStore(dataSource);
    }

    /**
     * algorithm encoder password.
     * 
     * @return algorithm BCrypt
     */
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {

        return new BCryptPasswordEncoder();
    }
}
