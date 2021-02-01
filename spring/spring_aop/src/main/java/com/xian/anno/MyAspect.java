package com.xian.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect // 标注当前MyAspect是一个切面
public class MyAspect {

    // 配置前置通知
    @Before(value = "execution(* com.xian.anno.*.*(..))")
    public void before(){
        System.out.println("前置增强....");
    }

    @AfterReturning(value = "pointcut()")
    public void afterReturn(){
        System.out.println("后置增强....");
    }

    // ProceedingJoinPoint: 正在执行的连接点== 切点
    @Around("MyAspect.pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强....");
        // 切点方法
        Object proceed = pjp.proceed();
        System.out.println("环绕后增强....");
        return proceed;
    }

    public void afterThrowing(){
        System.out.println("异常抛出增强...");
    }

    // 定义切点表达式
    @Pointcut("execution(* com.xian.anno.*.*(..))")
    public void pointcut(){}
}
