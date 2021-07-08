package org.example.ci;

public class Person
{
    private String name;
    private int personId;
    private Certify certi;
    public Person(String name,int personId, Certify certi)
    {
        this.name=name;
        this.personId=personId;
        this.certi=certi;
    }

    @Override
    public String toString() {
        return this.name+" : "+this.personId+"{"+this.certi.name+"}";
    }
}
