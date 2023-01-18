package com.reuleaux.sns.module.before.service.imp;

import com.reuleaux.sns.module.before.dao.TopicMsgDao;
import com.reuleaux.sns.module.before.service.TopicMsgService;
import com.reuleaux.sns.module.before.vo.TopicMsgVo;
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
     *
     * @return 以json格式响应ajax 返回一个topicMsgVo集合
     */
    @Override
    public List<TopicMsgVo>  getAllTopicMsgVo() {
        List<TopicMsgVo> topicMsgVoList = topicMsgDao.getAllTopicMsgVo("5c173b3312794537af02bf0237349df1");
        return topicMsgVoList;
    }
}
