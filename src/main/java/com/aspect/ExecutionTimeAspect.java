package com.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

    @Pointcut("@annotation(com.annotation.ExecutionTime)")
    public void checkPoint(){
        //System.out.println("进入切点");
    }

    @Before("checkPoint()")
    public void beforeCut(){
        System.out.println("start_method    切点前执行");
    }

    @After("checkPoint()")
    public void afterCut(){
        System.out.println("end_method    切点后执行");
    }

    @AfterReturning("checkPoint()")
    public void doAfterReturning() {
        System.out.println("目标方法返回时执行 ，后置返回通知");
    }

    @AfterThrowing("checkPoint()")
    public void afterThrowing(){
        System.out.println("目标方法抛出异常时执行 异常通知");
    }

}
