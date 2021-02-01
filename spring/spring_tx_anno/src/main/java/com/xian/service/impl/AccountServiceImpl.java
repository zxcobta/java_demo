package com.xian.service.impl;

import com.xian.dao.AccountDao;
import com.xian.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
// 下面两种都可以，一个表示给该类所有方法都加
@Transactional(isolation = Isolation.REPEATABLE_READ)
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    //@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public void transfer(String outMan, String inMan, double money) {
        accountDao.out(outMan, money);
        // 测试事务
//        System.out.println(1 / 0);
        accountDao.in(inMan, money);
    }
}
