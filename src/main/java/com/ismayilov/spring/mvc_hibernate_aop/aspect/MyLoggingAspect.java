package com.ismayilov.spring.mvc_hibernate_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@Aspect
public class MyLoggingAspect {

    @Around("execution(* com.ismayilov.spring.mvc_hibernate_aop.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        System.out.println("Begin of: " + methodSignature.getName());
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("End of: " + methodSignature.getName());
        return targetMethodResult;
    }
}
