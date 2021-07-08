package org.example.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.example.javaconfig")
public class JavaConfig
{
    @Bean
    public Name getName()
    {
        return new Name();
    }
    @Bean(name = {"temp1","temp2","temp3"})
    public Student getStudent()
    {
        Student student =new Student(getName());
        return student;
    }
}
