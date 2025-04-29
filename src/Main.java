import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {


        CustomerService customerService = new CustomerService();
        RoomService roomService = new RoomService();
        BookingSystem bookingSystem = new BookingSystem();


        Customer kunde = new Customer("Hossam","Lange Str 60 ","017565555",1);
        customerService.addCustomer(kunde);


        Room zimmer = new Room(101,"einzelzimmer",75.0,"123");
        roomService.addRoom(zimmer);


        bookingSystem.createBooking(kunde,zimmer, LocalDate.of(2025,5,1), LocalDate.of(2025,5,5));

        bookingSystem.printAllBookings();


    }
}