// Dynamic Binding
class A1 {
    void m1(){
        System.out.println("Coming from m1 method!");
    }
}
class B1 extends A1{
    @Override //At runtime this method will override the A1 class m1 method()
    void m1(){
        System.out.println("Coming from m2 method!");
    }
}
public class DPoly1 {
    public static void main(String[] args) {
        System.out.println("Hello Freshers");
        A1 obj = new B1();
        obj.m1();
    }
}