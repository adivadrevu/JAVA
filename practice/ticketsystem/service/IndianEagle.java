package practice.ticketsystem.service;

public class IndianEagle {
    private ITicketSystem ticketSystem;

    public IndianEagle(ITicketSystem ticketSystem) {
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
