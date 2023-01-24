package com.reuleaux.sns.module.before.web.controllers;

import com.github.pagehelper.PageHelper;
import com.reuleaux.sns.module.before.service.TopicMsgService;
import com.reuleaux.sns.module.before.vo.TopicMsgVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @RequestMapping(value = "/getTopicMsg")
    @ResponseBody
    public List<TopicMsgVo> getAllTopicMsg(String userUuid, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TopicMsgVo> topicMsgVoList = topicMsgService.getAllTopicMsgVo(userUuid);
        return topicMsgVoList;
    }

    //查未读题消息数量
    @RequestMapping(value = "/getTopicMsgCount")
    @ResponseBody
    public String getAllTopicMsg(String userUuid) {
        int count = topicMsgService.getTopicMsgCount(userUuid);
        return String.valueOf(count);
    }

    //更新话题消息阅读状态
    @RequestMapping(value = "/updateTopicMsgReadState.do")
    @ResponseBody
    public String updateTopicMsgReadState(String []topicMsgIdArrys) {
        topicMsgService.updateTopicMsgReadState(topicMsgIdArrys);
        return "success";
    }
}
