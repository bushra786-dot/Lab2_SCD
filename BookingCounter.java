package lab_2_bushra;

import java.util.ArrayList;
import java.util.List;

public class BookingCounter {
    private List<Ticket> bookedTickets = new ArrayList<>();

    public void addBooking(Ticket ticket) {
        bookedTickets.add(ticket);
        System.out.println("Ticket booked successfully.");
    }

    public void cancelBooking(Ticket ticket) {
        bookedTickets.remove(ticket);
        System.out.println("Ticket canceled successfully.");
    }
}
