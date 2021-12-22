package com.mytests.spring.aspectjtest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * *
 * <p>Created by irina on 22.12.2021.</p>
 * <p>Project: springboot-aspectj-test</p>
 * *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnno {
    public boolean isOk() default false;
}
