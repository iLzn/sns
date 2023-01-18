package com.reuleaux.sns.module.before.dao;

import com.reuleaux.sns.module.before.domain.TopicMsg;
import com.reuleaux.sns.module.before.vo.TopicMsgVo;

import java.util.List;

public interface TopicMsgDao {
    /*获取话题消息*/
    List<TopicMsg> getAllTopicMsg();

    /*添加话题消息*/
    int insertTopicMsg(TopicMsg topicMsg);

    /*获取话题vo*/
    List<TopicMsgVo> getAllTopicMsgVo(String userUuid);
}
