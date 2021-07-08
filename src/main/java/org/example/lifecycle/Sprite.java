package org.example.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sprite implements InitializingBean, DisposableBean
{
    private int price;

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        System.out.println("Setting the price of sprite");
        this.price = price;
    }

    public Sprite()
    {
        super();
    }

    @Override
    public String toString()
    {
        return "Sprite{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //This method will act as init()
        System.out.println("Inside init method of sprite.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destry method of sprite");
    }
}
