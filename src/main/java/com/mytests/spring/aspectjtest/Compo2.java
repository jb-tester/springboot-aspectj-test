package com.mytests.spring.aspectjtest;

import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 22.12.2021.</p>
 * <p>Project: springboot-aspectj-test</p>
 * *
 */
@Component
public class Compo2 {
    
    @MyAnno
    public void annotatedCompo2method1(){
        System.out.println("dummy annotated method executed");
    }
    @MyAnno(isOk = true)
    public void annotatedCompo2method2(){
        System.out.println("dummy annotated method executed");
    }
}
