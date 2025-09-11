
public class Main {
    public final static void main(String[] args) {
        System.out.println("Hello World !!");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
class Second {
    public static void main(String[] args) {
        System.out.println("Hello Jord");
        Main.main(new String[]{"Netero","Gon","Illumi"});
    }
}
