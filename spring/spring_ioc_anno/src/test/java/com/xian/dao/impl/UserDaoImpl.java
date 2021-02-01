package com.xian.dao.impl;

import com.xian.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


//<bean id="userDao" class="com.xian.dao.impl.UserDaoImpl"/>
//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("save running...");
    }
}
