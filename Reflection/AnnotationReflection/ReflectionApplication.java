package com.acn.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectionApplication {

    public static void main(String[] args) throws Exception {

        Class mySongReflection = Song.class;
        for (Annotation annotation : mySongReflection.getAnnotations()) {
            Class type = annotation.annotationType();
            System.out.println("Annotations of " + type.getName());
            
            for (Method method : type.getDeclaredMethods()) {
                Object value = method.invoke(annotation);
                System.out.println(" " + method.getName() + ": " + value);
            }

        }

    }

}