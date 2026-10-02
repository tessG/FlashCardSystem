import java.util.ArrayList;

public class Deck {
    private ArrayList<FlashCard> cards = new ArrayList<>();
    private int count = 0;
    private FlashCard currentCard;

    public void addCard(FlashCard fc){
        this.cards.add(fc);
    }
    public void displayAllCards(){
        for(FlashCard fc:cards){
            System.out.println(fc);
        }
    }
    public void displayNextCard(){
        currentCard = cards.get(count);
        System.out.println("\n********************");
        System.out.println(currentCard.getTerm());
        System.out.println("********************\n");
        count++;

    }
    public void flipCard(){
        System.out.println("\n********************");
        System.out.println(currentCard.getDescription());
        System.out.println("********************\n\n");
    }
}
