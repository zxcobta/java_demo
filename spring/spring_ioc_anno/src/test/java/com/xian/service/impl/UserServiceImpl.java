package com.xian.service.impl;

import com.xian.dao.UserDao;
import com.xian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//<bean id="userService" class="com.xian.service.impl.UserServiceImpl">
//@Component("userService" )
@Service("userService" )
//@Scope("prototype")
@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Value("${jdbc.driver}")
    private String driver;

    //    <property name="userDao" ref="userDao"/>
//    @Autowired // 按照数据类型从Spring容器中进行匹配
//    @Qualifier("userDao") // 按照id值从容器中进行匹配，此处Qualifier结合Autowired一起使用
    @Resource(name="userDao") // 相当于Qualifier+Autowired
    private UserDao userDao;

    // 使用注解方式可以不写下面的set方法，使用xml文件的方式必须要写set方法
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void save() {
        System.out.println("driver:" + driver);
        userDao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println("Service对象的初始化方法");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Service对象的销毁方法");
    }

}
