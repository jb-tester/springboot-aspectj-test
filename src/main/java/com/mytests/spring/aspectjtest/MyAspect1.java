package com.mytests.spring.aspectjtest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 22.12.2021.</p>
 * <p>Project: springboot-aspectj-test</p>
 * *
 */
@Aspect
@Component
public class MyAspect1 {


    @Before("""
            execution(* com.mytests.spring.aspectjtest.*.*(..))
            """)
    public void beforeAdvice() {
        System.out.println("=== before any method");
    }

    @Pointcut("""
execution(public * *(..))
""")
    private void anyPublicOperation() {
    }

    @Pointcut("""
within(com.mytests.spring.aspectjtest.Compo1)
""")
    private void inCompo1() {
    }

    @Pointcut("""
anyPublicOperation() && inCompo1()
            """)
    private void compo1Operation() {
    }

    @Around("compo1Operation()")
    public Object aroundCompo1Operations(ProceedingJoinPoint pjp) throws Throwable {
        final long start = System.currentTimeMillis();
        final Object proceed = pjp.proceed();
        final long executionTime = System.currentTimeMillis() - start;

        System.out.println(pjp.getSignature() + " executed in " + executionTime + "ms");

        return proceed;
    }

    @Pointcut("""
            @annotation(MyAnno)
            """)
    public void callAt(MyAnno MyAnno) {
    }

    @Around("callAt(MyAnno)")
    public Object around(ProceedingJoinPoint pjp,
                         MyAnno MyAnno) throws Throwable {
        return MyAnno.isOk() ? null : pjp.proceed();
    }
}
