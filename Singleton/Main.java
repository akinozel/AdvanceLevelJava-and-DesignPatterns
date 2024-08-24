package org.example;

import static java.lang.Thread.sleep;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //we will test here
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(1);
                }catch (InterruptedException e){

                }
                System.out.println("HashCode of Lazy: " + LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager: " + EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Enum: " + CacheSingleton.INSTANCE.hashCode());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("HashCode of Lazy: " + LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager: " + EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Enum: " + CacheSingleton.INSTANCE.hashCode());
            }
        }).start();

        //For me the output is:
//        HashCode of Lazy: 2042891924
//        HashCode of Lazy: 660961626
//        HashCode of Eager: 541178996
//        HashCode of Eager: 541178996
//        HashCode of Enum: 1725879665
//        HashCode of Enum: 1725879665
        //As you can see Lazy changed it instance and broke singleton principles but Eager and Enum worked
        //Also enum has less lines of code and better for the memory
    }
}