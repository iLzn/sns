package com.reuleaux.sns.module.before.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author 杉树下的松子
 * @date 2023/1/19 10:34
 */
@Entity
@Table(name = "tbl_topicMsg", schema = "sns")
public class TopicMsg {
    private String id;
    private String topicUuid;
    private String msgContent;
    private Timestamp publishDate;
    private String userUuid;
    private int isRead;
    private String publisherUuid;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return isRead == topicMsg.isRead &&
                Objects.equals(id, topicMsg.id) &&
                Objects.equals(topicUuid, topicMsg.topicUuid) &&
                Objects.equals(msgContent, topicMsg.msgContent) &&
                Objects.equals(publishDate, topicMsg.publishDate) &&
                Objects.equals(userUuid, topicMsg.userUuid) &&
                Objects.equals(publisherUuid, topicMsg.publisherUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, topicUuid, msgContent, publishDate, userUuid, isRead, publisherUuid);
    }
}
