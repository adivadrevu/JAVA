package practice.ticketsystem.service;

public class Kayak {
    private ITicketSystem ticketSystem;

    public Kayak(ITicketSystem ticketSystem) {
        this.ticketSystem = ticketSystem;
    }

    public void createTicket() {
        ticketSystem.createTicket();
    }

    public void updateTicket() {
        ticketSystem.updateTicket();
    }

    public void deleteTicket() {
        ticketSystem.deleteTicket();
    }

    public void viewTicket() {
        ticketSystem.viewTicket();
    }

}
