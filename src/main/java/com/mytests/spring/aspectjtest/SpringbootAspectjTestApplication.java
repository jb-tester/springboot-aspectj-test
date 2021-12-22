package com.mytests.spring.aspectjtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootAspectjTestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAspectjTestApplication.class, args);
    }
    @Autowired
    ApplicationContext ctx;
    @Override
    public void run(String... args) throws Exception {
       Compo1 c1  = ctx.getBean(Compo1.class);
        System.out.println(c1.getId());
        Compo2 c2 = ctx.getBean(Compo2.class);
        c2.annotatedCompo2method1();
        c2.annotatedCompo2method2();
    }
}
