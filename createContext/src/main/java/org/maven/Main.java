package org.maven;

import org.maven.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        ProjectConfig.class);
        Parrot parrot = context.getBean(Parrot.class);
        String str = context.getBean(String.class);
        Integer number = context.getBean(Integer.class);
        System.out.println(parrot.getName());
        System.out.println(str);
        System.out.println(number);
    }
}