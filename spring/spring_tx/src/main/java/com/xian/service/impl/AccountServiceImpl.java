package com.xian.service.impl;

import com.xian.dao.AccountDao;
import com.xian.service.AccountService;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String outMan, String inMan, double money) {
        accountDao.out(outMan, money);
        // 测试事务
//        System.out.println(1 / 0);
        accountDao.in(inMan, money);
    }
}
