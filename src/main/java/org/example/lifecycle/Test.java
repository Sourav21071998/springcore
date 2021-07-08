package org.example.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String args[])
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("org/example/lifecycle/config.xml");
        context.registerShutdownHook();

        //Pepsi pepsi=(Pepsi) context.getBean("pepsi");
        //System.out.println(pepsi);


        //Sprite sprite= (Sprite)context.getBean("sprite");
        //System.out.println(sprite);

        Exam exam=(Exam)context.getBean("exam");
        System.out.println(exam);
    }
}
