package org.example.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String args[])
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("org/example/stereotype/stereoconfig.xml");
        Student student1=context.getBean("ob",Student.class);
        System.out.println(student1);
        System.out.println(student1.getAddresses());
        System.out.println(student1.getAddresses().getClass().getName());
        Student student2=context.getBean("ob",Student.class);
        //Scope singleton example
        System.out.println("Scope of student1 : "+student1.hashCode());
        System.out.println("Scope of student2 : "+student2.hashCode());

        //Scope prototype example
        Teacher teacher1=context.getBean("teacher",Teacher.class);
        Teacher teacher2=context.getBean("teacher",Teacher.class);

        System.out.println("Scope of teacher1 : "+teacher1.hashCode());
        System.out.println("Scope of teacher2 : "+teacher2.hashCode());
    }
}
