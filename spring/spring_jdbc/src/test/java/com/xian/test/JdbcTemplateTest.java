package com.xian.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.beans.PropertyVetoException;


public class JdbcTemplateTest {

    @Test
    // 测试Spring产生JdbcTemplate模板
    public void test2() throws PropertyVetoException {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = app.getBean(JdbcTemplate.class);
        int row = jdbcTemplate.update("insert into account values(?,?)", "hh",2000);
        System.out.println(row);
    }

    @Test
    // 测试JdbcTemplate模板
    public void test1() throws PropertyVetoException {
        // 创建数据源对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        // 设置数据源对象  知道数据库在哪
        jdbcTemplate.setDataSource(dataSource);

        int row = jdbcTemplate.update("insert into account values(?,?)", "kuki",2000);
        System.out.println(row);
    }
}
