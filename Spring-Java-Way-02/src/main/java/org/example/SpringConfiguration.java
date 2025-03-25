package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example"})
public class SpringConfiguration {

    @Bean
    public Student getStudent() {
       Student student = new Student();
       student.setId(2);
       student.setName("Aniket");
       student.setAge(22);
       student.setAddress("Shirdi");
       return student;
    }
}
