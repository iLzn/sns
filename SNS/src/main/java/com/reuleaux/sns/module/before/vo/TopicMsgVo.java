package com.reuleaux.sns.module.before.vo;

/**
 * @author 杉树下的松子
 * @date 2023/1/17 18:29
 */
public class TopicMsgVo {
    int id;
    String topicUuid;
    String unick;
    String userHeaderImg;
    String msgContent;
    String publishDate;
    String publisherUuid;

    public TopicMsgVo(int id, String topicUuid, String unick, String userHeaderImg, String msgContent, String publishDate, String publisherUuid) {
        this.id = id;
        this.topicUuid = topicUuid;
        this.unick = unick;
        this.userHeaderImg = userHeaderImg;
        this.msgContent = msgContent;
        this.publishDate = publishDate;
        this.publisherUuid = publisherUuid;
    }

    public TopicMsgVo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopicUuid() {
        return topicUuid;
    }

    public void setTopicUuid(String topicUuid) {
        this.topicUuid = topicUuid;
    }

    public String getUnick() {
        return unick;
    }

    public void setUnick(String unick) {
        this.unick = unick;
    }

    public String getUserHeaderImg() {
        return userHeaderImg;
    }

    public void setUserHeaderImg(String userHeaderImg) {
        this.userHeaderImg = userHeaderImg;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublisherUuid() {
        return publisherUuid;
    }

    public void setPublisherUuid(String publisherUuid) {
        this.publisherUuid = publisherUuid;
    }
}