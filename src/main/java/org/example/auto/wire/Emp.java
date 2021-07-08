package org.example.auto.wire;

public class Emp
{
    private Address address;

    @Override
    public String toString()
    {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    public Emp()
    {
    }

    public Emp(Address address)
    {
        System.out.println("Inside constructor");
        this.address = address;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        System.out.println("Setting address");
        this.address = address;
    }
}
