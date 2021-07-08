package org.example.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Exam
{
    private String subject;

    public Exam() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @PostConstruct
    public void start()
    {
        System.out.println("Inside start method.");
    }
    @PreDestroy
    public void end()
    {
        System.out.println("Inside end method.");
    }
}
