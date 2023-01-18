package com.reuleaux.sns.module.before.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 杉树下的松子
 * @date 2023/1/17 21:04
 */
@Entity
@Table(name = "tbl_topic", schema = "sns")
public class Topic {
    private String topicUuid;

    @Id
    @Column(name = "topicUuid")
    public String getTopicUuid() {
        return topicUuid;
    }

    public void setTopicUuid(String topicUuid) {
        this.topicUuid = topicUuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Topic topic = (Topic) o;

        if (topicUuid != null ? !topicUuid.equals(topic.topicUuid) : topic.topicUuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return topicUuid != null ? topicUuid.hashCode() : 0;
    }
}
