package org.example.lifecycle;

public class Pepsi
{
    private double price;

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        System.out.println("Setting the price of pepsi.");
        this.price = price;
    }

    public Pepsi()
    {
    }

    @Override
    public String toString()
    {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    public void hey()
    {
        System.out.println("Inside init method of pepsi: Hey!");
    }

    public void bye()
    {
        System.out.println("Inside destroy method of pepsi: Bye!");
    }
}
