package com.reuleaux.sns.module.before.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author 杉树下的松子
 * @date 2023/1/17 21:04
 */
@Entity
@Table(name = "tbl_userInfo", schema = "sns")
public class UserInfo {
    private String userUuid;
    private String realName;
    private Timestamp birthday;
    private Object sex;
    private String phone;
    private String signature;
    private String userHeaderImg;

    @Id
    @Column(name = "userUuid")
    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    @Basic
    @Column(name = "realName")
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "birthday")
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "sex")
    public Object getSex() {
        return sex;
    }

    public void setSex(Object sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "signature")
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Basic
    @Column(name = "userHeaderImg")
    public String getUserHeaderImg() {
        return userHeaderImg;
    }

    public void setUserHeaderImg(String userHeaderImg) {
        this.userHeaderImg = userHeaderImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfo userInfo = (UserInfo) o;

        if (userUuid != null ? !userUuid.equals(userInfo.userUuid) : userInfo.userUuid != null) return false;
        if (realName != null ? !realName.equals(userInfo.realName) : userInfo.realName != null) return false;
        if (birthday != null ? !birthday.equals(userInfo.birthday) : userInfo.birthday != null) return false;
        if (sex != null ? !sex.equals(userInfo.sex) : userInfo.sex != null) return false;
        if (phone != null ? !phone.equals(userInfo.phone) : userInfo.phone != null) return false;
        if (signature != null ? !signature.equals(userInfo.signature) : userInfo.signature != null) return false;
        if (userHeaderImg != null ? !userHeaderImg.equals(userInfo.userHeaderImg) : userInfo.userHeaderImg != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userUuid != null ? userUuid.hashCode() : 0;
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (signature != null ? signature.hashCode() : 0);
        result = 31 * result + (userHeaderImg != null ? userHeaderImg.hashCode() : 0);
        return result;
    }
}
