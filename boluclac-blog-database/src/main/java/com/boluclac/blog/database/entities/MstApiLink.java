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
 * MstApiLink generated by hbm2java
 */
@Entity
@Table(name = "mst_api_link", catalog = "boluclac_blog", uniqueConstraints = @UniqueConstraint(columnNames = "url"))
public class MstApiLink implements java.io.Serializable {

    private int                  id;

    private int                  version;

    private MstUser              mstUserByUpdater;

    private MstUser              mstUserByCreater;

    private String               url;

    private String               name;

    private boolean              delFlag;

    private String               createDate;

    private String               updateDate;

    private Set<LinkApiLinkRole> linkApiLinkRoles = new HashSet<LinkApiLinkRole>(0);

    public MstApiLink() {

    }

    public MstApiLink(int id, MstUser mstUserByUpdater, MstUser mstUserByCreater, String url, String name, boolean delFlag,
            String createDate, String updateDate) {

        this.id = id;
        this.mstUserByUpdater = mstUserByUpdater;
        this.mstUserByCreater = mstUserByCreater;
        this.url = url;
        this.name = name;
        this.delFlag = delFlag;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public MstApiLink(int id, MstUser mstUserByUpdater, MstUser mstUserByCreater, String url, String name, boolean delFlag,
            String createDate, String updateDate, Set<LinkApiLinkRole> linkApiLinkRoles) {

        this.id = id;
        this.mstUserByUpdater = mstUserByUpdater;
        this.mstUserByCreater = mstUserByCreater;
        this.url = url;
        this.name = name;
        this.delFlag = delFlag;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.linkApiLinkRoles = linkApiLinkRoles;
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
    @JoinColumn(name = "updater", nullable = false)
    public MstUser getMstUserByUpdater() {

        return this.mstUserByUpdater;
    }

    public void setMstUserByUpdater(MstUser mstUserByUpdater) {

        this.mstUserByUpdater = mstUserByUpdater;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creater", nullable = false)
    public MstUser getMstUserByCreater() {

        return this.mstUserByCreater;
    }

    public void setMstUserByCreater(MstUser mstUserByCreater) {

        this.mstUserByCreater = mstUserByCreater;
    }

    @Column(name = "url", unique = true, nullable = false, length = 512)
    public String getUrl() {

        return this.url;
    }

    public void setUrl(String url) {

        this.url = url;
    }

    @Column(name = "name", nullable = false, length = 1024)
    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mstApiLink")
    public Set<LinkApiLinkRole> getLinkApiLinkRoles() {

        return this.linkApiLinkRoles;
    }

    public void setLinkApiLinkRoles(Set<LinkApiLinkRole> linkApiLinkRoles) {

        this.linkApiLinkRoles = linkApiLinkRoles;
    }

}
