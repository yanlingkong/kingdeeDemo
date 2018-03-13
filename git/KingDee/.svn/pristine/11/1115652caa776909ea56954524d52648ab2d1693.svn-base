package com.kingdee.utils;

import com.kingdee.configuration.properties.config.BaseProperties;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * Created by lucl on 2017/6/8.
 * AOP 获取请求方法路径 及打印日志
 */
@Aspect
@Component
@Slf4j
public class ControllerInterceptor {
    @Autowired
    private BaseProperties baseProperties;

    @Pointcut("execution(public * com.hurongsoft.controller..*(..))" +
            " and and @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void pointMethod(){

    }
    @Before("pointMethod()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        Method method = signature.getMethod(); //获取被拦截的方法
//        String methodName = method.getName(); //获取被拦截的方法名
//        System.out.println("methodName===="+methodName);
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();
        // 获取请求地址
        String requestPath0 = request.getRequestURI();
        String requestPath = requestPath0.split("/")[requestPath0.split("/").length-1];
        Common.post_Url = baseProperties.getBaseUrl()+"/api/"+requestPath;
    }

    @AfterReturning(returning = "ret", pointcut = "pointMethod()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        log.info("ret======"+ret);
    }
}
