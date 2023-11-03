
package com.Day3;

public class Car {
    private String name;
    private int price;

    public Car(String name ,int price){ // parameter constructor
        this.name = name;
        this.price = price;
    }
    public Car(String name){ // default cons and parameter
        this.name = name;
    }
    public Car(){ // default cons
    }
    public void display(){
        System.out.println("Hello constructor");
    }
    public static void main(String[] args) {
        Car car = new Car("Punch",500000);
        System.out.println(" "+ car.name+" "+car.price);
        System.out.println(car.name);
        car.display();
    }

}