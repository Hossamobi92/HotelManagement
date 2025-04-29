import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private List<Booking> bookings = new ArrayList<>();
    private int bookingCounter =1;




    //Der Nutzer wählt einen Kunden und ein Zimmer aus.

    public void createBooking(Customer customer, Room room, LocalDate checkIn, LocalDate checkOut){

        Booking booking = new Booking(bookingCounter,customer,  room,checkIn,checkOut);
        bookings.add(booking);
        bookingCounter ++;
        System.out.println("Buchung erfolgreich erstellt: Buchungs- ID: "+ booking.getBookingId());




   }

   // Alle Buchungen zurückgeben
    public List<Booking> getAllBooking(){
        return bookings;
    }

    // Alle Buchungen anzeigen

    public void printAllBookings(){
        for (Booking booking : bookings){
            System.out.println("ID: " + booking.getBookingId()
                    + ", Kunde: " + booking.getCustomer().getName()
                    + ", Zimmer: " + booking.getRoom().getZimmernummer()
                    + ", Von: " + booking.getCheckIn()
                    + ", Bis: " + booking.getCheckOut());
        }
    }


}
