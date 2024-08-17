package org.example;

public class TantuniMenuB {

    //builder design pattern
    private String BreadType;

    private String TurkishYogurt;
    private String Drink;



    public static class Builder{
        private String BreadType;

        private String Dessert;
        private String Drink;

        public Builder(String breadType) {

            BreadType = breadType;
        }
        public Builder WantingYogurt(String dessert){
            Dessert = dessert;
            return this;
        }
        public Builder WantingDrink(String drink){
            Drink = drink;
            return this;
        }
        public TantuniMenuB build(){
            return new TantuniMenuB(this);
        }
    }
    public TantuniMenuB(Builder builder) {
        BreadType = builder.BreadType;
        TurkishYogurt = builder.Dessert;
        Drink= builder.Drink;
    }

}
