package datenightatthearcade;

import java.util.Random;

public class Game {

    private int credits;

    Game(int credits) {
        this.credits = credits;
    }

    public void play(Card c) {

        if (c.getCreditBalance() < 0) {
            System.out.println("You don't have enough balance to play the game.");
            System.exit(0);
        } else if (c.getCreditBalance() >= getCredits()) // checks if card has enough creditBalance to play the game
        {
            int creditBalance = c.getCreditBalance();
            creditBalance = creditBalance - getCredits();
            c.setCreditBalance(creditBalance);
            // takes away the credits from creditBalance
            Random rand = new Random(); //Randomly generating ticketBalance

            int ticketBalance = rand.nextInt(50) + c.getTicketBalance();
            c.setTicketBalance(ticketBalance);

        }

    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

}
