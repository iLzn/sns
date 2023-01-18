package com.reuleaux.sns.module.before.web.controllers;

import com.reuleaux.sns.module.before.service.TopicMsgService;
import com.reuleaux.sns.module.before.vo.TopicMsgVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 杉树下的松子
 * @date 2023/1/16 23:24
 */
@Controller
public class TopicMsgController {
    @Resource
    TopicMsgService topicMsgService;
    //查询出所有话题消息
    @RequestMapping(value = "/test.do")
    @ResponseBody
    public List<TopicMsgVo> getAllTopicMsg(){
        List<TopicMsgVo>  topicMsgVoList=  topicMsgService.getAllTopicMsgVo();
        return  topicMsgVoList;
    }
}
