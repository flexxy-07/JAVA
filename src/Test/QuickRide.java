
package Test;


interface Booking {
    void cnfBooking();
    int cancelBooking() throws Exception;
    void genTicket();
}

abstract class AbsBooking implements Booking{
    String ID;
    int price;
    boolean isConfirmed;

    public AbsBooking (String ID, int price){
        this.ID = ID;
        this.price = price;
        this.isConfirmed = false;
    }
    public void genTicket(){
        System.out.println("Ticket generated for booking ID : " + ID);
    }

}
class BookCab extends AbsBooking {
    public BookCab(String ID, int price){
        super(ID,price);
    }
    public void cnfBooking(){
        isConfirmed = true;
        System.out.println("Cab booked with ID : " + ID);
    }

    public int cancelBooking(){
        System.out.println("Cab Booking canceled with ID : " + ID);
        return 300;
    }

}
class BookTrain extends AbsBooking{
    public BookTrain(String ID, int price){
        super(ID,price);
    }
    public void cnfBooking(){
        isConfirmed = true;
        System.out.println("Train booked with ID : " + ID);
    }
    public int cancelBooking(){
        System.out.println("Train booking canceled with ID : " + ID);
        return 1000;
    }
}

class BookBus extends AbsBooking{
    public BookBus(String ID, int price){
        super(ID,price);
    }
    public void cnfBooking(){
        isConfirmed = true;
        System.out.println("Bus booked with ID : " + ID);
    }
    public int cancelBooking() throws Exception{
        throw new Exception("Bus booking can not be canceled or rescheduled");
    }
}
public class QuickRide{
    public static void main(String[] args) throws Exception{
        try {
            BookCab cab = new BookCab("RXG5465",500);
            cab.cnfBooking();
            cab.genTicket();
            System.out.println("Refunded : " + cab.cancelBooking());
            System.out.println();

            BookTrain train = new BookTrain("TTIRY69", 1500);
            train.cnfBooking();
            train.genTicket();
            System.out.println("Refunded : " + train.cancelBooking());
            System.out.println();

            BookBus bus = new BookBus("BUS97E", 2000);
            bus.cnfBooking();
            bus.genTicket();
            bus.cancelBooking();
        }catch (Exception e){
            System.out.println("Error : "  + e);
        }
    }
}
