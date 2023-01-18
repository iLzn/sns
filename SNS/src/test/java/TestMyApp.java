
import com.github.javafaker.Faker;
import com.reuleaux.sns.module.before.dao.TopicMsgDao;
import com.reuleaux.sns.module.before.dao.UserDao;
import com.reuleaux.sns.module.before.domain.TopicMsg;
import com.reuleaux.sns.module.before.domain.User;
import com.reuleaux.sns.utils.*;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.List;


/**
 * @author 杉树下的松子
 * @data 2021/3/13
 */
public class TestMyApp {
    /*测试
     * 获取所有topicMsg
     * */
    @Test
    public void testGetAllTopicMsg() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        TopicMsgDao topicMsgDao = sqlSession.getMapper(TopicMsgDao.class);
        List<TopicMsg> topicMsgList = topicMsgDao.getAllTopicMsg();
        System.out.println("===================");
        topicMsgList.forEach(topicMsg -> System.out.println(topicMsg));
        sqlSession.close();
    }

    /**
     * 假数据添加topicMsg
     */
    @Test
    public void testInsertTopicMsg() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        TopicMsgDao topicMsgDao = sqlSession.getMapper(TopicMsgDao.class);
        Faker faker = FakerDataUtil.setChina();
        for (int i = 0; i < 100; i++) {
            TopicMsg topicMsg = new TopicMsg();
            topicMsg.setTopicUuid("61326068ff9f47428f05fdccfea8ea9b");
            topicMsg.setMsgContent(faker.backToTheFuture().quote());
            topicMsg.setPublishDate(DateTimeUtil.getSysTimeSql());
            topicMsg.setUserUuid("5c173b3312794537af02bf0237349df1");
            topicMsg.setIsRead(0);
            topicMsg.setPublisherUuid("68c05ec6f4694baaab83a3e5bcfbbd5d");
            topicMsgDao.insertTopicMsg(topicMsg);
        }
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 假数据添加user
     */
    @Test
    public void testInsertUser() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        Faker faker = FakerDataUtil.setChina();
        for (int i = 0; i < 3; i++) {
            User user = new User();
            user.setUserUuid(UUIDUtil.getUUID());
            user.setUnick(faker.name().fullName());
            user.setUname(faker.phoneNumber().phoneNumber());
            user.setUpwd(MD5Util.getMD5("123456"));
            user.setUemail("null");
            user.setExpireTime(DateTimeUtil.getSysTimeSql());
            user.setUstate(0);
            user.setUgroups(0);
            user.setCreateBy(UUIDUtil.getUUID());
            user.setCreateTime(DateTimeUtil.getSysTimeSql());
            user.setEditBy(UUIDUtil.getUUID());
            user.setEditTime(DateTimeUtil.getSysTimeSql());
            userDao.insertUser(user);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}

