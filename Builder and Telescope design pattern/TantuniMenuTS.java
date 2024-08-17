package org.example;

public class TantuniMenuTS {

    //telescope design pattern
    private String BreadType;

    private String Dessert;
    private String Drink;

    public TantuniMenuTS(String breadType) {
        BreadType = breadType;
    }

    public TantuniMenuTS(String breadType, String dessert) {
        BreadType = breadType;
        Dessert = dessert;
    }

    public TantuniMenuTS(String breadType, String dessert, String drink) {
        BreadType = breadType;
        Dessert = dessert;
        Drink = drink;
    }
}
