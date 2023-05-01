package org.example.config;

import org.example.component.Parrot;
import org.example.component.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean("firstPerson")
    public Person person() {
        Person person = new Person();
        person.setName("Ella");
        person.setParrot(parrot());
        return person;
    }

    @Bean("secondPerson")
    public Person secondPerson(Parrot parrot) {
        Person person = new Person();
        person.setName("Andrii");
        person.setParrot(parrot);
        return person;
    }
}
