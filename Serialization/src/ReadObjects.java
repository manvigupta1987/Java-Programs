import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("ReadObjects!");

        try (FileInputStream fi = new FileInputStream("people.bin");
             ObjectInputStream ois = new ObjectInputStream(fi);) {

            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

            @SuppressWarnings("unchecked")
            ArrayList<Person> peopleList = (ArrayList<Person>)ois.readObject();
            for(Person person: peopleList){
                System.out.println(person);
            }

            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
