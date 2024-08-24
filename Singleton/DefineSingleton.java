package org.example;

public class DefineSingleton {
    public static DefineSingleton ds = new DefineSingleton();
    private DefineSingleton(){

    }
    public static DefineSingleton getInstance(){
        return ds;
    }
}
