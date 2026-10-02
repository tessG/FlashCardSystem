import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

    public void readData(String path, Deck deck){

        File file = new File(path);
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();//skip header
            while(scan.hasNextLine()){
                String s = scan.nextLine();// "Instatiering , kfdksadfkaflækfadskljafdslkadfsklæfdas"
                String[] values = s.split(",");//
                String term = values[0] ;
                String description = values[1];

                FlashCard fc = new FlashCard (term, description);
                 deck.addCard(fc);
            }

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());

        }




    }
}
