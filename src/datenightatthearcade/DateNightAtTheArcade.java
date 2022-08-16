package datenightatthearcade;

import java.util.Scanner;

public class DateNightAtTheArcade {

    public static void main(String[] args) {
        // TODO code application logic here
        int amt1, amt2;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter money in the terminal for Card1: ");
        amt1 = input.nextInt();
        System.out.println("Please enter money in the terminalfor Card2: ");
        amt2 = input.nextInt();
        Card card1 = new Card(); // A card created with a unique id (1)
        Card card2 = new Card(); // Another card created with a unique id
        Game game1 = new Game(5); // A playable game which costs 5 credits per play 
        Game game2 = new Game(7); // Another playable game which costs 7 credits per play 
        Terminal terminal1 = new Terminal(); // A terminal created 
        //Terminal terminal2 = new Terminal(); // Another terminal created 
        terminal1.addCredits(card1, amt1); // add 40 credits with $20 into card1 
        terminal1.addCredits(card2, amt2); // add 40 credits with $20 into card2
        System.out.println("\n\n>>> Card #1 is used to play Game #1 5 times...");
        for (int i = 0; i < 5; i++) {
            game1.play(card1); // play game1 5 times with card1 
        }
        System.out.println("Card 1 balance after playing game.");
        card1.cardBalance();
        System.out.println("\n\n>>> Card #2 is used to play Game #2 7 times...");
        for (int i = 0; i < 7; i++) {
            game2.play(card2); // play game1 7 times with card2 
        }
        System.out.println("Card 2 balance after playing game.");
        card2.cardBalance();
        System.out.println("\n\n>>> Credits & Tickets will be transferred from Card #1 to Card #2...");
        terminal1.transferCredits(card1, card2); // transfer credrits from card1 to card2 
        terminal1.transferTickets(card1, card2); // transfer tickets from card1 to card2 
        /**
         * **UNCOMMENT FOLLOWING LINES TO SEE THE IF WE CAN USE CARD1 TO PLAY
         * THE GAME***
         */
        /* System.out.println("\n\n>>> Card #1 is used to play Game #1 one more time..."); 
        game1.play(card1); // try to play game1 again with card1 */
        System.out.println("\n\n>>> Request different prizes with Card #1 and Card #2..."); // request prize (Candy, Hat or Classes) with card1 or card 2. // prize may be claimed with enough tickets or may not if not enough tickets 
        PrizeCategory p1 = new PrizeCategory();

        String prize;
        System.out.println("""
                       Choose the prize: 
                        Candy for 5 tickets
                        Hat for 7 tickets
                        Glasses for 12 tickets""");
        prize = input.next();
        System.out.println("Choose the card1/card2:");
        int c = input.nextInt();
        if (c == 1) {
            p1.prizeClaim(prize, card1);
        } else if (c == 2) {
            p1.prizeClaim(prize, card2);
        }

    }
}
