package com.xian.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;

// 标志该类是Spring的核心配置类
@Configuration

//<context:component-scan base-package="com.xian"/>
@ComponentScan("com.xian")
// <import resource=""/>
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {
}
