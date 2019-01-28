import java.io.*;

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
        return success;
    }

    public Card readFirstRecord() {
        Card data = null;
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(DB_NAME));
            data = (Card) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
                if(ois!= null)ois.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
        return data;
    }
}
