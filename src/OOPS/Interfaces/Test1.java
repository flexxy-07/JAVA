package OOPS.Interfaces;
interface Inter1 {  // In interface is empty, then it is called marker Interface
    int x = 112;      // If there is only one method inside the interface, then it is called functional interface
    public abstract void method1();
    // the variable inside a interface is always a public static final.
    // The methods in a interfaces are public abstract.
}
public class Test1 implements Inter1 {
    public static void main(String[] args) {
        System.out.println("Main Entry Point");
    }
    public void method1(){
        System.out.println("THis is my method 1!!");
    }
}