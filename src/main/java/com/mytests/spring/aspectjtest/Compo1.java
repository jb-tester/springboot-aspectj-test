package com.mytests.spring.aspectjtest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 22.12.2021.</p>
 * <p>Project: springboot-aspectj-test</p>
 * *
 */
@Component
public class Compo1 {
    
   String id;

    public String getId() {
        return id;
    }
    @Value("${compo1.id}")
    public void setId(String id) {
        this.id = id;
    }
}
