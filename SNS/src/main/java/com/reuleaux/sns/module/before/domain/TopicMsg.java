package com.reuleaux.sns.module.before.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author 杉树下的松子
 * @date 2023/1/17 23:06
 */
@Entity
@Table(name = "tbl_topicMsg", schema = "sns")
public class TopicMsg {
    private int id;
    private String topicUuid;
    private String msgContent;
    private Timestamp publishDate;
    private String userUuid;
    private int isRead;
    private String publisherUuid;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "topicUuid")
    public String getTopicUuid() {
        return topicUuid;
    }

    public void setTopicUuid(String topicUuid) {
        this.topicUuid = topicUuid;
    }

    @Basic
    @Column(name = "msgContent")
    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    @Basic
    @Column(name = "publishDate")
    public Timestamp getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Timestamp publishDate) {
        this.publishDate = publishDate;
    }

    @Basic
    @Column(name = "userUuid")
    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    @Basic
    @Column(name = "isRead")
    public int getIsRead() {
        return isRead;
    }

    public void setIsRead(int isRead) {
        this.isRead = isRead;
    }

    @Basic
    @Column(name = "publisherUuid")
    public String getPublisherUuid() {
        return publisherUuid;
    }

    public void setPublisherUuid(String publisherUuid) {
        this.publisherUuid = publisherUuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TopicMsg topicMsg = (TopicMsg) o;

        if (id != topicMsg.id) return false;
        if (isRead != topicMsg.isRead) return false;
        if (topicUuid != null ? !topicUuid.equals(topicMsg.topicUuid) : topicMsg.topicUuid != null) return false;
        if (msgContent != null ? !msgContent.equals(topicMsg.msgContent) : topicMsg.msgContent != null) return false;
        if (publishDate != null ? !publishDate.equals(topicMsg.publishDate) : topicMsg.publishDate != null)
            return false;
        if (userUuid != null ? !userUuid.equals(topicMsg.userUuid) : topicMsg.userUuid != null) return false;
        if (publisherUuid != null ? !publisherUuid.equals(topicMsg.publisherUuid) : topicMsg.publisherUuid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (topicUuid != null ? topicUuid.hashCode() : 0);
        result = 31 * result + (msgContent != null ? msgContent.hashCode() : 0);
        result = 31 * result + (publishDate != null ? publishDate.hashCode() : 0);
        result = 31 * result + (userUuid != null ? userUuid.hashCode() : 0);
        result = 31 * result + isRead;
        result = 31 * result + (publisherUuid != null ? publisherUuid.hashCode() : 0);
        return result;
    }
}
