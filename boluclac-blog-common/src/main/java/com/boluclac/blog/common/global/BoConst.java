/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.common.global;

/**
 * Bo luc lac blog api constant.
 * 
 * @author boluclac
 *
 */
public final class BoConst {

    /** prefix role name. */
    public static final String PREFIX_ROLE = "ROLE_";

    /**
     * Account type.
     * 
     * @author boluclac
     *
     */
    public final class AccountType {

        /** account login by user name and password. */
        public static final int PASSWORD_ACCOUNT = 1;

        /** login using google account. */
        public static final int GOOGLE_ACCOUNT = 2;

        /** login using facebook account. */
        public static final int FACEBOOK_ACCOUNT = 3;

        /**
         * Constructor.
         */
        private AccountType() {

            // do nothing
        }
    }

    /**
     * URL type.
     * 
     * @author boluclac
     *
     */
    public final class UrlType {

        /** access any user. */
        public static final int ACCESS_ALL = 1;

        /** access be user don't authenticate. */
        public static final int ACCESS_ANONYMOUS    = 2;

        /** access by user authenticate. */
        public static final int ACCESS_AUTHENTICATE = 3;

        /**
         * Constructor.
         */
        private UrlType() {

            // do nothing
        }
    }

    /**
     * Constructor.
     */
    private BoConst() {

        // do nothing
    }

}
