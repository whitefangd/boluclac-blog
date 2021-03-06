package com.boluclac.blog.database.entities;
// Generated Nov 8, 2018, 12:11:55 AM by Hibernate Tools 5.2.11.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * MstAccount generated by hbm2java
 */
@Entity
@Table(name = "mst_account", catalog = "boluclac_blog", uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "account_type"}))
public class MstAccount implements java.io.Serializable {

    private int     id;

    private int     version;

    private MstUser mstUserByCreater;

    private MstUser mstUserByUpdater;

    private MstUser mstUserByUserId;

    private int     accountType;

    private String  accountName;

    private String  password;

    private boolean delFlag;

    private String  createDate;

    private String  updateDate;

    public MstAccount() {

    }

    public MstAccount(int id, MstUser mstUserByCreater, MstUser mstUserByUpdater, MstUser mstUserByUserId, int accountType,
            String accountName, String password, boolean delFlag, String createDate, String updateDate) {

        this.id = id;
        this.mstUserByCreater = mstUserByCreater;
        this.mstUserByUpdater = mstUserByUpdater;
        this.mstUserByUserId = mstUserByUserId;
        this.accountType = accountType;
        this.accountName = accountName;
        this.password = password;
        this.delFlag = delFlag;
        this.createDate = createDate;
        this.updateDate = updateDate;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    public MstUser getMstUserByUserId() {

        return this.mstUserByUserId;
    }

    public void setMstUserByUserId(MstUser mstUserByUserId) {

        this.mstUserByUserId = mstUserByUserId;
    }

    @Column(name = "account_type", nullable = false)
    public int getAccountType() {

        return this.accountType;
    }

    public void setAccountType(int accountType) {

        this.accountType = accountType;
    }

    @Column(name = "account_name", nullable = false, length = 256)
    public String getAccountName() {

        return this.accountName;
    }

    public void setAccountName(String accountName) {

        this.accountName = accountName;
    }

    @Column(name = "password", nullable = false, length = 256)
    public String getPassword() {

        return this.password;
    }

    public void setPassword(String password) {

        this.password = password;
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

}
