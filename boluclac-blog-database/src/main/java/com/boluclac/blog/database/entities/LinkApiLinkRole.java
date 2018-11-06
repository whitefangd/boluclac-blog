package com.boluclac.blog.database.entities;
// Generated Nov 6, 2018, 10:01:22 PM by Hibernate Tools 5.2.11.Final

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
 * LinkApiLinkRole generated by hbm2java
 */
@Entity
@Table(name = "link_api_link_role", catalog = "boluclac_blog", uniqueConstraints = @UniqueConstraint(columnNames = {"url_id", "role_id"}))
public class LinkApiLinkRole implements java.io.Serializable {

    private int        id;

    private int        version;

    private MstApiLink mstApiLink;

    private MstRole    mstRole;

    private MstUser    mstUserByCreater;

    private MstUser    mstUserByUpdater;

    private boolean    delFlag;

    private String     createDate;

    private String     updateDate;

    public LinkApiLinkRole() {

    }

    public LinkApiLinkRole(int id, MstApiLink mstApiLink, MstRole mstRole, MstUser mstUserByCreater, MstUser mstUserByUpdater,
            boolean delFlag, String createDate, String updateDate) {

        this.id = id;
        this.mstApiLink = mstApiLink;
        this.mstRole = mstRole;
        this.mstUserByCreater = mstUserByCreater;
        this.mstUserByUpdater = mstUserByUpdater;
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
    @JoinColumn(name = "url_id", nullable = false)
    public MstApiLink getMstApiLink() {

        return this.mstApiLink;
    }

    public void setMstApiLink(MstApiLink mstApiLink) {

        this.mstApiLink = mstApiLink;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    public MstRole getMstRole() {

        return this.mstRole;
    }

    public void setMstRole(MstRole mstRole) {

        this.mstRole = mstRole;
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