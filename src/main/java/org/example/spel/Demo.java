package org.example.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo
{
    @Value("#{44+49}")
    private int x;

    @Value("#{6<8?93:88}")
    private int y;

    @Value("#{ T(java.lang.Math).sqrt(144) }")
    private double z;

    @Value("#{ T(java.lang.Math).E }")
    private double e;

    @Value("#{8>4}")
    private boolean isTrue;

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value("#{new java.lang.String('Sourav Sarkar')}")
    private String name;

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", isTrue=" + isTrue +
                ", name='" + name + '\'' +
                '}';
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
