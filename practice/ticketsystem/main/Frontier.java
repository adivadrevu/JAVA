package practice.ticketsystem.main;

public class Frontier {

    private ITicketSystem ticketSystem;


    public Frontier(ITicketSystem ticketSystem) {
        super();
        this.ticketSystem = ticketSystem;
    }

    public Frontier() {
        super();
    }


    public void setTicketSystem(ITicketSystem ticketSystem) {
        this.ticketSystem = ticketSystem;
    }

    public boolean createTicket() {
        ticketSystem.createTicket();
        return true;
    }

    

}
