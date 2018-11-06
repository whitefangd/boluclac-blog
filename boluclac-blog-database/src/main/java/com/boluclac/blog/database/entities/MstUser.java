package com.boluclac.blog.database.entities;
// Generated Nov 6, 2018, 10:01:22 PM by Hibernate Tools 5.2.11.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * MstUser generated by hbm2java
 */
@Entity
@Table(name = "mst_user", catalog = "boluclac_blog", uniqueConstraints = @UniqueConstraint(columnNames = "user_name"))
public class MstUser implements java.io.Serializable {

    private int                  id;

    private int                  version;

    private MstUser              mstUserByCreater;

    private MstUser              mstUserByUpdater;

    private String               userName;

    private String               name;

    private boolean              system;

    private boolean              delFlag;

    private String               createDate;

    private String               updateDate;

    private Set<MstAccount>      mstAccountsForCreater      = new HashSet<MstAccount>(0);

    private Set<MstRole>         mstRolesForUpdater         = new HashSet<MstRole>(0);

    private Set<MstUser>         mstUsersForCreater         = new HashSet<MstUser>(0);

    private Set<MstAccount>      mstAccountsForUpdater      = new HashSet<MstAccount>(0);

    private Set<MstAccount>      mstAccountsForUserId       = new HashSet<MstAccount>(0);

    private Set<LnkUserRole>     lnkUserRolesForCreater     = new HashSet<LnkUserRole>(0);

    private Set<LnkUserRole>     lnkUserRolesForUserId      = new HashSet<LnkUserRole>(0);

    private Set<LinkApiLinkRole> linkApiLinkRolesForCreater = new HashSet<LinkApiLinkRole>(0);

    private Set<MstLanguage>     mstLanguagesForCreater     = new HashSet<MstLanguage>(0);

    private Set<LnkUserRole>     lnkUserRolesForUpdater     = new HashSet<LnkUserRole>(0);

    private Set<MstLanguage>     mstLanguagesForUpdater     = new HashSet<MstLanguage>(0);

    private Set<MstApiLink>      mstApiLinksForUpdater      = new HashSet<MstApiLink>(0);

    private Set<LinkApiLinkRole> linkApiLinkRolesForUpdater = new HashSet<LinkApiLinkRole>(0);

    private Set<MstRole>         mstRolesForCreater         = new HashSet<MstRole>(0);

    private Set<MstApiLink>      mstApiLinksForCreater      = new HashSet<MstApiLink>(0);

    private Set<MstUser>         mstUsersForUpdater         = new HashSet<MstUser>(0);

    public MstUser() {

    }

    public MstUser(int id, MstUser mstUserByCreater, MstUser mstUserByUpdater, String userName, String name, boolean system,
            boolean delFlag, String createDate, String updateDate) {

        this.id = id;
        this.mstUserByCreater = mstUserByCreater;
        this.mstUserByUpdater = mstUserByUpdater;
        this.userName = userName;
        this.name = name;
        this.system = system;
        this.delFlag = delFlag;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public MstUser(int id, MstUser mstUserByCreater, MstUser mstUserByUpdater, String userName, String name, boolean system,
            boolean delFlag, String createDate, String updateDate, Set<MstAccount> mstAccountsForCreater, Set<MstRole> mstRolesForUpdater,
            Set<MstUser> mstUsersForCreater, Set<MstAccount> mstAccountsForUpdater, Set<MstAccount> mstAccountsForUserId,
            Set<LnkUserRole> lnkUserRolesForCreater, Set<LnkUserRole> lnkUserRolesForUserId,
            Set<LinkApiLinkRole> linkApiLinkRolesForCreater, Set<MstLanguage> mstLanguagesForCreater,
            Set<LnkUserRole> lnkUserRolesForUpdater, Set<MstLanguage> mstLanguagesForUpdater, Set<MstApiLink> mstApiLinksForUpdater,
            Set<LinkApiLinkRole> linkApiLinkRolesForUpdater, Set<MstRole> mstRolesForCreater, Set<MstApiLink> mstApiLinksForCreater,
            Set<MstUser> mstUsersForUpdater) {

        this.id = id;
        this.mstUserByCreater = mstUserByCreater;
        this.mstUserByUpdater = mstUserByUpdater;
        this.userName = userName;
        this.name = name;
        this.system = system;
        this.delFlag = delFlag;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.mstAccountsForCreater = mstAccountsForCreater;
        this.mstRolesForUpdater = mstRolesForUpdater;
        this.mstUsersForCreater = mstUsersForCreater;
        this.mstAccountsForUpdater = mstAccountsForUpdater;
        this.mstAccountsForUserId = mstAccountsForUserId;
        this.lnkUserRolesForCreater = lnkUserRolesForCreater;
        this.lnkUserRolesForUserId = lnkUserRolesForUserId;
        this.linkApiLinkRolesForCreater = linkApiLinkRolesForCreater;
        this.mstLanguagesForCreater = mstLanguagesForCreater;
        this.lnkUserRolesForUpdater = lnkUserRolesForUpdater;
        this.mstLanguagesForUpdater = mstLanguagesForUpdater;
        this.mstApiLinksForUpdater = mstApiLinksForUpdater;
        this.linkApiLinkRolesForUpdater = linkApiLinkRolesForUpdater;
        this.mstRolesForCreater = mstRolesForCreater;
        this.mstApiLinksForCreater = mstApiLinksForCreater;
        this.mstUsersForUpdater = mstUsersForUpdater;
    }

    @Id

    @Column(name = "id", unique = true, nullable = false)
    public int getId() {

        return this.id;
    }

    public void setId(int id) {

        this.id = id;
    }

    @Version
    @Column(name = "version", nullable = false)
    public int getVersion() {

        return this.version;
    }

    public void setVersion(int version) {

        this.version = version;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creater", nullable = false)
    public MstUser getMstUserByCreater() {

        return this.mstUserByCreater;
    }

    public void setMstUserByCreater(MstUser mstUserByCreater) {

        this.mstUserByCreater = mstUserByCreater;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "updater", nullable = false)
    public MstUser getMstUserByUpdater() {

        return this.mstUserByUpdater;
    }

    public void setMstUserByUpdater(MstUser mstUserByUpdater) {

        this.mstUserByUpdater = mstUserByUpdater;
    }

    @Column(name = "user_name", unique = true, nullable = false, length = 50)
    public String getUserName() {

        return this.userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    @Column(name = "name", nullable = false, length = 128)
    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Column(name = "system", nullable = false)
    public boolean isSystem() {

        return this.system;
    }

    public void setSystem(boolean system) {

        this.system = system;
    }

    @Column(name = "del_flag", nullable = false)
    public boolean isDelFlag() {

        return this.delFlag;
    }

    public void setDelFlag(boolean delFlag) {

        this.delFlag = delFlag;
    }

    @Column(name = "create_date", nullable = false, length = 14)
    public String getCreateDate() {

        return this.createDate;
    }

    public void setCreateDate(String createDate) {

        this.createDate = createDate;
    }

    @Column(name = "update_date", nullable = false, length = 14)
    public String getUpdateDate() {

        return this.updateDate;
    }

    public void setUpdateDate(String updateDate) {

        this.updateDate = updateDate;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByCreater")
    public Set<MstAccount> getMstAccountsForCreater() {

        return this.mstAccountsForCreater;
    }

    public void setMstAccountsForCreater(Set<MstAccount> mstAccountsForCreater) {

        this.mstAccountsForCreater = mstAccountsForCreater;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByUpdater")
    public Set<MstRole> getMstRolesForUpdater() {

        return this.mstRolesForUpdater;
    }

    public void setMstRolesForUpdater(Set<MstRole> mstRolesForUpdater) {

        this.mstRolesForUpdater = mstRolesForUpdater;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByCreater")
    public Set<MstUser> getMstUsersForCreater() {

        return this.mstUsersForCreater;
    }

    public void setMstUsersForCreater(Set<MstUser> mstUsersForCreater) {

        this.mstUsersForCreater = mstUsersForCreater;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByUpdater")
    public Set<MstAccount> getMstAccountsForUpdater() {

        return this.mstAccountsForUpdater;
    }

    public void setMstAccountsForUpdater(Set<MstAccount> mstAccountsForUpdater) {

        this.mstAccountsForUpdater = mstAccountsForUpdater;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByUserId")
    public Set<MstAccount> getMstAccountsForUserId() {

        return this.mstAccountsForUserId;
    }

    public void setMstAccountsForUserId(Set<MstAccount> mstAccountsForUserId) {

        this.mstAccountsForUserId = mstAccountsForUserId;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByCreater")
    public Set<LnkUserRole> getLnkUserRolesForCreater() {

        return this.lnkUserRolesForCreater;
    }

    public void setLnkUserRolesForCreater(Set<LnkUserRole> lnkUserRolesForCreater) {

        this.lnkUserRolesForCreater = lnkUserRolesForCreater;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByUserId")
    public Set<LnkUserRole> getLnkUserRolesForUserId() {

        return this.lnkUserRolesForUserId;
    }

    public void setLnkUserRolesForUserId(Set<LnkUserRole> lnkUserRolesForUserId) {

        this.lnkUserRolesForUserId = lnkUserRolesForUserId;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByCreater")
    public Set<LinkApiLinkRole> getLinkApiLinkRolesForCreater() {

        return this.linkApiLinkRolesForCreater;
    }

    public void setLinkApiLinkRolesForCreater(Set<LinkApiLinkRole> linkApiLinkRolesForCreater) {

        this.linkApiLinkRolesForCreater = linkApiLinkRolesForCreater;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByCreater")
    public Set<MstLanguage> getMstLanguagesForCreater() {

        return this.mstLanguagesForCreater;
    }

    public void setMstLanguagesForCreater(Set<MstLanguage> mstLanguagesForCreater) {

        this.mstLanguagesForCreater = mstLanguagesForCreater;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByUpdater")
    public Set<LnkUserRole> getLnkUserRolesForUpdater() {

        return this.lnkUserRolesForUpdater;
    }

    public void setLnkUserRolesForUpdater(Set<LnkUserRole> lnkUserRolesForUpdater) {

        this.lnkUserRolesForUpdater = lnkUserRolesForUpdater;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByUpdater")
    public Set<MstLanguage> getMstLanguagesForUpdater() {

        return this.mstLanguagesForUpdater;
    }

    public void setMstLanguagesForUpdater(Set<MstLanguage> mstLanguagesForUpdater) {

        this.mstLanguagesForUpdater = mstLanguagesForUpdater;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByUpdater")
    public Set<MstApiLink> getMstApiLinksForUpdater() {

        return this.mstApiLinksForUpdater;
    }

    public void setMstApiLinksForUpdater(Set<MstApiLink> mstApiLinksForUpdater) {

        this.mstApiLinksForUpdater = mstApiLinksForUpdater;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByUpdater")
    public Set<LinkApiLinkRole> getLinkApiLinkRolesForUpdater() {

        return this.linkApiLinkRolesForUpdater;
    }

    public void setLinkApiLinkRolesForUpdater(Set<LinkApiLinkRole> linkApiLinkRolesForUpdater) {

        this.linkApiLinkRolesForUpdater = linkApiLinkRolesForUpdater;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByCreater")
    public Set<MstRole> getMstRolesForCreater() {

        return this.mstRolesForCreater;
    }

    public void setMstRolesForCreater(Set<MstRole> mstRolesForCreater) {

        this.mstRolesForCreater = mstRolesForCreater;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByCreater")
    public Set<MstApiLink> getMstApiLinksForCreater() {

        return this.mstApiLinksForCreater;
    }

    public void setMstApiLinksForCreater(Set<MstApiLink> mstApiLinksForCreater) {

        this.mstApiLinksForCreater = mstApiLinksForCreater;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstUserByUpdater")
    public Set<MstUser> getMstUsersForUpdater() {

        return this.mstUsersForUpdater;
    }

    public void setMstUsersForUpdater(Set<MstUser> mstUsersForUpdater) {

        this.mstUsersForUpdater = mstUsersForUpdater;
    }

}
