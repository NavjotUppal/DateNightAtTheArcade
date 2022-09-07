package datenightatthearcade;

public class Card {

    static int id = 1;
    private int cardNum;
    private int creditBalance;
    private int ticketBalance;

    Card() {
        cardNum = id++;

    }

    public void cardBalance() {
        System.out.println("Card" + getCardNum() + " Credit Balance is: " + getCreditBalance() + "\n TicketBalance is: " + getTicketBalance());

        if (getTicketBalance() < 0 || getCreditBalance() < 0) {
            System.out.println("You don't have enough balance");
            System.exit(0);
        }
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }

    public int getTicketBalance() {
        return ticketBalance;
    }

    public void setTicketBalance(int ticketBalance) {
        this.ticketBalance = ticketBalance;
    }

    
    public int getCardNum() {
        return cardNum;
    }

    
    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

}
