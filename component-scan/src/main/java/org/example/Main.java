package org.example;

import org.example.component.Parrot;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        ProjectConfig.class);
        Parrot parrot = new Parrot();
        parrot.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> parrot;

        context.registerBean("parrot1", Parrot.class, parrotSupplier);
        Parrot resultParrot = context.getBean(Parrot.class);
        System.out.println(resultParrot.getName());
    }
}