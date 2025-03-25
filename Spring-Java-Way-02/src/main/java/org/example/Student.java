package org.example;

import lombok.*;

//I want to create this class object from the Spring
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
}
