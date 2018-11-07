/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.api.config.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boluclac.blog.common.global.BoConst;
import com.boluclac.blog.common.global.BoConst.AccountType;
import com.boluclac.blog.common.global.MsgConst;
import com.boluclac.blog.database.entities.LnkUserRole;
import com.boluclac.blog.database.entities.MstAccount;
import com.boluclac.blog.database.entities.MstRole;
import com.boluclac.blog.database.entities.MstUser;
import com.boluclac.blog.database.repositories.MstAccountRepository;

/**
 * User details service.
 * 
 * @author boluclac
 *
 */
@Transactional
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    /** table mst_account repository. */
    @Autowired
    private MstAccountRepository accountRepository;

    /**
     * load user and password from account name.
     * 
     * @param accountName
     *            Account name
     * @throws UsernameNotFoundException
     *             user not found
     */
    @Override
    public UserDetails loadUserByUsername(final String accountName) throws UsernameNotFoundException {

        List<GrantedAuthority> authorities = new ArrayList<>();

        MstAccount account = accountRepository.findByAccountNameAndAccountTypeAndDelFlag(accountName, AccountType.PASSWORD_ACCOUNT, false);
        if (account != null) {
            MstUser mstUser = account.getMstUserByUserId();
            if (mstUser != null) {
                Set<LnkUserRole> linkRoles = mstUser.getLnkUserRolesForUserId();
                if (linkRoles != null && !linkRoles.isEmpty()) {
                    for (LnkUserRole linkRole : linkRoles) {
                        MstRole role = linkRole.getMstRole();
                        SimpleGrantedAuthority userRole = new SimpleGrantedAuthority(BoConst.PREFIX_ROLE + role.getValue());
                        authorities.add(userRole);
                    }

                    return new UserInfomation(accountName, account.getPassword(), authorities);
                }
            }
        }
        throw new UsernameNotFoundException(MsgConst.Error.ERROR_LOGIN_FAILD);
    }

}
