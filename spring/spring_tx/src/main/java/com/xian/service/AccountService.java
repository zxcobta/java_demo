package com.xian.service;

import com.xian.dao.AccountDao;

public interface AccountService {
    public void transfer(String outMan, String inMan, double money);
}
