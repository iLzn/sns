package com.reuleaux.sns.module.before.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author 杉树下的松子
 * @date 2023/1/18 0:15
 */
@Entity
@Table(name = "tbl_user", schema = "sns")
public class User {
    private String userUuid;
    private String unick;
    private String uname;
    private String upwd;
    private String uemail;
    private Timestamp expireTime;
    private int ustate;
    private int ugroups;
    private String createBy;
    private Timestamp createTime;
    private String editBy;
    private Timestamp editTime;
    private String ip;

    @Id
    @Column(name = "userUuid")
    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    @Basic
    @Column(name = "unick")
    public String getUnick() {
        return unick;
    }

    public void setUnick(String unick) {
        this.unick = unick;
    }

    @Basic
    @Column(name = "uname")
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Basic
    @Column(name = "upwd")
    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    @Basic
    @Column(name = "uemail")
    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    @Basic
    @Column(name = "expireTime")
    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    @Basic
    @Column(name = "ustate")
    public int getUstate() {
        return ustate;
    }

    public void setUstate(int ustate) {
        this.ustate = ustate;
    }

    @Basic
    @Column(name = "ugroups")
    public int getUgroups() {
        return ugroups;
    }

    public void setUgroups(int ugroups) {
        this.ugroups = ugroups;
    }

    @Basic
    @Column(name = "createBy")
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "editBy")
    public String getEditBy() {
        return editBy;
    }

    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }

    @Basic
    @Column(name = "editTime")
    public Timestamp getEditTime() {
        return editTime;
    }

    public void setEditTime(Timestamp editTime) {
        this.editTime = editTime;
    }

    @Basic
    @Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return ustate == user.ustate &&
                ugroups == user.ugroups &&
                Objects.equals(userUuid, user.userUuid) &&
                Objects.equals(unick, user.unick) &&
                Objects.equals(uname, user.uname) &&
                Objects.equals(upwd, user.upwd) &&
                Objects.equals(uemail, user.uemail) &&
                Objects.equals(expireTime, user.expireTime) &&
                Objects.equals(createBy, user.createBy) &&
                Objects.equals(createTime, user.createTime) &&
                Objects.equals(editBy, user.editBy) &&
                Objects.equals(editTime, user.editTime) &&
                Objects.equals(ip, user.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userUuid, unick, uname, upwd, uemail, expireTime, ustate, ugroups, createBy, createTime, editBy, editTime, ip);
    }
}
