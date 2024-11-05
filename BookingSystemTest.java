package lab_2_bushra;

import java.util.Date;

public class BookingSystemTest {
    public static void main(String[] args) {
        // Creating a customer
        Customer customer = new Customer("C123", "Alice", "123 Street", 1234567890, 25);
        customer.addDetails();
        
        // Creating an agent
        Agent agent = new Agent(1, "John");

        // Booking a ticket
        Ticket ticket = new Ticket("City A", "City B", new Date(), "10:00 AM", "BUS123", "Seat 5A");
        BookingCounter bookingCounter = new BookingCounter();
        bookingCounter.addBooking(ticket);
        
        // Display ticket details
        ticket.displayTicketDetails();

        // Customer requests a refund
        Refund refund = new Refund(50.0f, "C123");
        refund.refundAmount();
    }
}
