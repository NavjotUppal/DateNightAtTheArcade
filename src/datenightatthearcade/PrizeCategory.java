package datenightatthearcade;

public class PrizeCategory {

    private int count;
    private int ticketsNeeded;

    public void prizeClaim(String prize, Card c) {
        switch (prize) {
            case "Candy" -> {
                setCount(5);
                setTicketsNeeded(10);
            }
            case "Hat" -> {
                setCount(7);
                setTicketsNeeded(7);
            }
            case "Glasses" -> {
                setCount(10);
                setTicketsNeeded(12);
            }
            default -> {
                System.out.println(prize + " gift is not in the system. Please enter the valid gift next time.");
                setCount(0);
                setTicketsNeeded(0);
            }


        }
        if ((c.getTicketBalance() - getTicketsNeeded()) > 0 && getCount() > 0) {
            System.out.println("You have used "
                    + getTicketsNeeded() + "tickets for prize " + prize
                    + ". Your current balance is " + (c.getTicketBalance() - getTicketsNeeded())
                    + " tickets");
        } else if (getCount() <= 0) {
            System.out.println(prize + "is not available on this terminal.");
        } else {
            System.out.println("You don't have enough balance. Please try another card");
        }
    }

 
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    
    public int getTicketsNeeded() {
        return ticketsNeeded;
    }

    
    public void setTicketsNeeded(int ticketsNeeded) {
        this.ticketsNeeded = ticketsNeeded;
    }

}
