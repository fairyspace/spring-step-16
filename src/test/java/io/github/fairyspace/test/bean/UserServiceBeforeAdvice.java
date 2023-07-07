package io.github.fairyspace.test.bean;

import io.github.fairyspace.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class UserServiceBeforeAdvice  implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("拦截方法[前]：" + method.getName());
    }
}
