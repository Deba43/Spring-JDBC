package com.Deba.SpringJDBCDemo.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Scope("prototype")
@Data
public class Student {
    private int id;
    private int age;
    private String name;
    private String tech;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
