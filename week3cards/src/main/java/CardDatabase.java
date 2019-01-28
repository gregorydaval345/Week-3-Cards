import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CardDatabase implements IDatabase<Card>{

    public static final String DB_NAME="cards.data"; // final: value wont change; // static  - all objects


    public boolean save(Card item) {
        boolean success = false;
        ObjectOutputStream oos = null;
        try {oos = new ObjectOutputStream(new FileOutputStream(DB_NAME));

        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                if(oos !=  null) oos.close();
            } catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return false;
    }

    public Card readFirstRecord() {
        return null;
    }
}
