package OOPS.Abstraction;
// We can't create a object of abstract class
abstract public class Vehicle {
    int NumTyre;
    void common(){
        System.out.println("This is Common");
    }
    abstract void stop();
    public static void main(String[] args) {
        Car scorpio = new Car();
        scorpio.NumTyre = 4;
        scorpio.stop();
    }
}