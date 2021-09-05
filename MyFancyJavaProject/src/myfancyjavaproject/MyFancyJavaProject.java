/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfancyjavaproject;

/**
 *
 * @author Rabbi
 */
public class MyFancyJavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car object = new Car("Toyota", 100000);
        
        System.out.println("Car Name: "+ object.name + " | Car price: "+ object.price);
    }
    
}


class Car{
    String name;
    int price;
    Car(String name, int price){
        this.name=name;
        this.price = price;
    }
}