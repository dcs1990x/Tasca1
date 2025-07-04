package sprint1Tasca1_1_Nivell1_ex2;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Civic", 200); //Brand cannot be added to the constructor because it is a class constant

        System.out.println(Car.getBRAND());   //The static constant attribute can only be accessed from the class
        System.out.println(Car.getModel());   //The static attribute can only be accessed from the class
        System.out.println(car.getPOWER());   //The instance constant attribute is accessed from the instance
        
        Car.brake();
        car.accelerate();
    }
}