package com.reuleaux.sns.module.before.service.imp;

import com.reuleaux.sns.module.before.dao.TopicMsgDao;
import com.reuleaux.sns.module.before.domain.TopicMsg;
import com.reuleaux.sns.module.before.service.TopicMsgService;
import com.reuleaux.sns.module.before.vo.TopicMsgVo;
import com.reuleaux.sns.utils.DateTimeUtil;
import com.reuleaux.sns.utils.UUIDUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 杉树下的松子
 * @date 2023/1/16 23:19
 */

@Service
public class TopicMsgServiceImp implements TopicMsgService {
    @Resource
    TopicMsgDao topicMsgDao;



    /**
     * @return 返回一个topicMsgVo集合
     */
    @Override
    public List<TopicMsgVo> getAllTopicMsgVo(String userUuid) {
        List<TopicMsgVo> topicMsgVoList = topicMsgDao.getAllTopicMsgVo(userUuid);
        return topicMsgVoList;
    }
    /**
     * @return 返回一话题消息的数量
     */
    @Override
    public int getTopicMsgCount(String userUuid) {
        int count = topicMsgDao.getTopicMsgCount(userUuid);
        return count;
    }

    /**
     *
     *return 插入数量
     *
     */
    @Override
    public int insertTopicMsg(TopicMsg topicMsg) {
        topicMsg.setId(UUIDUtil.getUUID());
        topicMsg.setPublishDate(DateTimeUtil.getSysTimeSql());
        topicMsg.setIsRead(0);
        int count = topicMsgDao.insertTopicMsg(topicMsg);
        return 0;
    }

    /**
     *
     * @return 返回修改数量
     */
    @Override
    public int updateTopicMsgReadState(String[] topicMsgIdArry) {
        int count = topicMsgDao.updateTopicMsgReadState(topicMsgIdArry);
        return count;
    }
}
