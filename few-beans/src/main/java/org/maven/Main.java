package org.maven;

import org.maven.component.Parrot;
import org.maven.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        ProjectConfig.class);
        Parrot firstParrot = context.getBean("Koko", Parrot.class);
        Parrot secondParrot = context.getBean("parrot2", Parrot.class);
        Parrot thirdParrot = context.getBean(Parrot.class);
        System.out.println(firstParrot.getName());
        System.out.println(secondParrot.getName());
        System.out.println(thirdParrot.getName());
    }
}