package com.xian.factory;


import com.xian.dao.UserDao;
import com.xian.dao.impl.UserDaoImpl;


public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
