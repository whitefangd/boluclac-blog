/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.api.config.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * user information for security.
 * 
 * @author boluclac
 *
 */
public class UserInfomation extends User {

    /*** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * 
     * @param username
     *            user name
     * @param password
     *            password
     * @param authorities
     *            list authorities (roles)
     */
    public UserInfomation(final String username, final String password, final Collection<? extends GrantedAuthority> authorities) {

        super(username, password, authorities);
    }

}
