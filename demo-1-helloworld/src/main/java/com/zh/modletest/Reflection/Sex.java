package com.zh.modletest.Reflection;

import java.lang.annotation.*;

/**
 * 自定义注解
 *
 * @author Ender
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Sex {
    String value() default "def";

    Gender gender();

    enum Gender {
        /**
         *
         */
        BOY,
        GIRL
    }

    ;
}
