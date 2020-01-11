package com.github.publisherfk.aop.ch553;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * @author fukun
 */
public class SimpleStaticPointcut extends StaticMethodMatcherPointcut {

    private String methodName = "sing";

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return methodName.equals(method.getName());
    }

    @Override
    public ClassFilter getClassFilter() {
        return cls -> (cls == GoodGuitarist.class);
    }
}
