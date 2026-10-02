import java.util.Scanner;

public class Main {


    public static void main(String [] args){
        Deck deck = new Deck();
        FileIO io = new FileIO();
        io.readData("data/flashcards.csv", deck);
       // deck.displayAllCards();

        boolean running = true;
        while(running) {
            deck.displayNextCard();
             System.out.println(" 1) quit\n" +
                                " 2) next \n" +
                                 "3) flip \n");

             Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();//scanneren skal instansieres
            switch (choice) {
                case 1:
                    running = false;
                    break;
                case 2:
                    deck.displayNextCard();
                    break;
                case 3:
                    deck.flipCard();//metoden skal implementeres
                    break;
            }

            }
        }
    }

