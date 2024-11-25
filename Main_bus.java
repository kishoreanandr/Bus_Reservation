
import java.util.*;

public class Main_bus {
    public static void main(String[] args) {
        ArrayList<Bus> buses=new ArrayList<>();
        ArrayList<passanger_details> Bookings=new ArrayList<>();

        buses.add(new Bus(1, false, 2));
        buses.add(new Bus(2, true, 40));
        buses.add(new Bus(3, true, 60));
        buses.add(new Bus(4, false, 20));

        System.out.println("The buses are: ");
        
        for(Bus b:buses){
            b.displayInfo();
        }

        int userOpt=1;
        Scanner scan =new Scanner(System.in);

        while(userOpt==1)
        {
            System.out.println("Enter 1 to book and 2 to Exit");
            userOpt=scan.nextInt();
            if(userOpt==1){
                passanger_details booking=new passanger_details();
                if(booking.isAvailable(buses,Bookings)){
                    Bookings.add(booking);
                    System.out.println("Congratulations! "+booking.passenger_name+" You Ticket is Confirmed");
                }else{
                    System.out.println("Sorry!! try different bus or date");
                }
            }
        }
        scan.close();
    }
}
