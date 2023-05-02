package org.example;

import org.example.components.Person;
import org.example.components.SecondPerson;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person firstPerson = context.getBean(Person.class);
        SecondPerson secondPerson = context.getBean(SecondPerson.class);
        System.out.println("Person's name: " + firstPerson.getName());
        System.out.println("Person's parrot: " + firstPerson.getParrot());
        System.out.println("----------------------");
        System.out.println("Second person's name: " + secondPerson.getName());
        System.out.println("second person's parrot: " + secondPerson.getParrot());
    }
}