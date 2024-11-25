import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class passanger_details {
    String passenger_name;
    int bus_no;
    Date date;
    Scanner scan=new Scanner(System.in);
    passanger_details(){
        System.out.println("Enter your Name: ");
        passenger_name=scan.next();
        System.out.println("Enter Bus No: ");
        bus_no=scan.nextInt();
        System.out.println("Enter date of travelling(dd-mm-yyyy): ");
        String input_date=scan.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");

        try {
            date=dateFormat.parse(input_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    public boolean isAvailable(ArrayList<Bus> buses,ArrayList<passanger_details> bookings){
        int capacity=0;
        for(Bus b:buses){
            if(b.getBusNo()==bus_no)
            {
                capacity=b.getCapacity();
            }
        }
        int booked=0;
        for(passanger_details booking:bookings){
            if(booking.bus_no==bus_no && booking.date.equals(date)){
                booked++;
            }
        }
        return capacity>booked?true:false;
    }
}
