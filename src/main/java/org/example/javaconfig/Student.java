package org.example.javaconfig;

import org.springframework.stereotype.Component;

//@Component
public class Student
{
    private Name studentName;

    public Student(Name studentName) {
        this.studentName = studentName;
    }

    public void study()
    {
        this.studentName.display();
        System.out.println("Studying");
    }

}
