package com.driver;

public class Main {

    public static void main(String[] args) {

        RWOnly rwOnly= new RWOnly();

        /**
         * rwOnly.encaps="Encapsulation";
         * 'encaps' has private access in 'com.driver.RWOnly'
         **/


        rwOnly.setName("This is encapsulation.");
        System.out.println(rwOnly.getName());
    }
  
}