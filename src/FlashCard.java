public class FlashCard {
    private String term;
    private String description;

    public FlashCard(String term, String description){
        this.term = term;
        this.description = description;
    }


    public String getTerm(){
        return term;
    }

    public String getDescription(){
        return description;
    }
}
