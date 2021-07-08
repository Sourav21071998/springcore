package org.example.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person
{
    private List<String> names;
    private Map<String,Integer> feestructure;
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<String, Integer> getFeestructure() {
        return feestructure;
    }

    public void setFeestructure(Map<String, Integer> feestructure) {
        this.feestructure = feestructure;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", feestructure=" + feestructure +
                ", properties=" + properties +
                '}';
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
