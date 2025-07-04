package sprint1Tasca1_1_Nivell1_ex2;

import lombok.Getter;

public class Car {

    @Getter private static final String BRAND = "Honda"; // static constant (class-level)
    @Getter private static String model;                 // static variable (class-level)
    @Getter private final int POWER;                     // instance constant

    public Car(String model, int power) {
        // this.BRAND = "Honda";
        Car.model = model;
        this.POWER = power;
    }
    
    public void setModel(String model) {
    	Car.model = model;
    }

    public static void brake() {
        System.out.println("The vehicle is braking.");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }
}