package com.xian.dao.impl;

import com.xian.dao.UserDao;
import com.xian.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    private String userName;
    private Integer age;
    private List<String> stringList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //    public UserDaoImpl() {
//        System.out.println("UserDaoImpl创建....");
//    }
//
//    public void init(){
//        System.out.println("初始化方法....");
//    }
//
//    public void destroy(){
//        System.out.println("销毁方法....");
//    }
//
    public void save(){
//        System.out.println("userName:" + userName);
//        System.out.println("age:" + age);
        System.out.println("stringList:" + stringList);
        System.out.println("userMap:" + userMap);
        System.out.println("properties:" + properties);
    }
}
