/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.database.repositories;

import com.boluclac.blog.database.entities.MstAccount;
import com.boluclac.blog.database.repositories.base.MstAccountBaseRepository;

/**
 * table mst_account repository.
 * 
 * @author boluclac
 *
 */
public interface MstAccountRepository extends MstAccountBaseRepository {

    /**
     * find by account_name and account_type and del_flag.
     * 
     * @param accountName
     *            account name
     * @param accountType
     *            account type
     * @param delFlag
     *            delete flag.
     *            <ul>
     *            <li>{@link Boolean#TRUE TRUE}: user deleted</li>
     *            <li>{@link Boolean#FALSE FALSE}: user don't delete</li>
     *            </ul>
     * @return Mst Account object
     */
    MstAccount findByAccountNameAndAccountTypeAndDelFlag(String accountName, int accountType, boolean delFlag);

}
