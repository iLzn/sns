package com.reuleaux.sns.module.before.service;


import com.reuleaux.sns.module.before.domain.TopicMsg;
import com.reuleaux.sns.module.before.vo.TopicMsgVo;

import java.util.List;

public interface TopicMsgService {
    /*查询话题消息*/
    List<TopicMsgVo> getAllTopicMsgVo(String userUuid);
    /*获取话题消息数量*/
    int getTopicMsgCount(String userUuid);
    /*更新话题消息阅读状态*/
    int updateTopicMsgReadState(String [] topicMsgIdArry);
    /*插入一条消息*/
    int insertTopicMsg(TopicMsg topicMsg);
}
