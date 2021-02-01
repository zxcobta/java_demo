package com.xian.factory;

import com.xian.dao.UserDao;
import com.xian.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
