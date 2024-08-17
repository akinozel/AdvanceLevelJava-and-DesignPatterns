package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Scenario is a customer ordered a tantuni with coke

        //Builder design pattern
        TantuniMenuB tntb = new TantuniMenuB.Builder("lavash").WantingDrink("coke").build();
        //here is customer wanted a lavash tantuni and a coke without any dessert.


        //Telescope design pattern
        TantuniMenuTS tntts = new TantuniMenuTS("lavash",null,"coke");
        //As you can see sometimes telescope design pattern can make issues


    }
}