package com.dao;

import com.dao.service.IUserService;
import com.dao.service.IWWJDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/1/19.
 */
public class UserServiceConsumer {

    private static Logger logger = LoggerFactory.getLogger(UserServiceConsumer.class);

    public static void main(String args[]) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) ctx.getBean("userService");
        IWWJDService wwjdService = (IWWJDService) ctx.getBean("wwjdService");
        logger.info("执行结果：" + wwjdService.getString("不详之刃"));
        logger.info("执行结果：" + userService.login("wwjd", "wwjd"));
    }
}