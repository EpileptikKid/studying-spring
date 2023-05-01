package org.example;

import org.example.component.Parrot;
import org.example.component.Person;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(
                        ProjectConfig.class);
        Person firstPerson = context.getBean("firstPerson", Person.class);
        Person secondPerson = context.getBean("secondPerson", Person.class);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println("First person's name - " + firstPerson.getName());
        System.out.println("First person's parrot - " + firstPerson.getParrot());
        System.out.println("------------------------");
        System.out.println("Second person's name - " + secondPerson.getName());
        System.out.println("Second person's parrot - " + secondPerson.getParrot());
    }
}