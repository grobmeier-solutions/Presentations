package com.acn.reflection;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.*;

@Retention(RUNTIME)
public @interface MyAnnotation {
    String name() default "";

    String description() default "";
}
