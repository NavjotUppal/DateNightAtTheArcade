package datenightatthearcade;

public class Terminal {

    public void addCredits(Card c, int credits) {
        credits = credits * 2;
        c.setCreditBalance(credits);
    }

    public void transferCredits(Card c1, Card c2) {
        int credit1 = c1.getCreditBalance();
        int credit2 = c2.getCreditBalance();
        credit2 = credit1 + credit2;
        c1.setCreditBalance(0);
        c2.setCreditBalance(credit2);
        if (credit2 > 0) {
            System.out.println("Total Credits available for Card 2: " + credit2);

        } else {
            System.out.println("Your balance is negative.");
            System.exit(0);
        }
    }

    public void transferTickets(Card c1, Card c2) {
        int ticket1 = c1.getTicketBalance();
        int ticket2 = c2.getTicketBalance();
        ticket2 = ticket1 + ticket2;
        c1.setTicketBalance(0);
        c2.setTicketBalance(ticket2);
        if (ticket2 > 0) {
            System.out.println("Total tickets available for Card 2: " + ticket2);
        } else {
            System.out.println("Your balance is negative.");
            System.exit(0);
        }
    }

}
