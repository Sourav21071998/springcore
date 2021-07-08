package org.example.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp
{
    @Autowired
    @Qualifier("address2")
    private Address address;

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
    //@Autowired
    //@Qualifier("address2")
    public void setAddress(Address address) {
        System.out.println("Setting address");
        this.address = address;
    }

    public Emp() {
    }

    public Emp(Address address) {
        System.out.println("Inside constructor");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }


}
