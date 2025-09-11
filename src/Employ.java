public class Employ {
    int nEmp;
    String sName;
    long nSal;

    void nCalIncome(long nSal){
        System.out.println("return income tax");
    }

    public static void main(String[] args) {
        Employ e1 = new Employ();
        e1.nEmp = 1234;
        e1.sName = "Bootlicker";

        System.out.println("The name of the employee : " + e1.sName);
    }
}