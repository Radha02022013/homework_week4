package methodoverriding23;

/**
 * 23.2 //Creating a child class
 * class Bike2 extends Vehicle{
 * //defining the same method as in the parent class
 * public void run(){System.out.println("Bike is running safely");}
 */

public class Bike2 extends Vehicle {


    //defining the same method as in the parent class
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 b = new Bike2(); // creating object in the main method to call above instance method
        b.run(); // calling method
    }
}
