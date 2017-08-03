import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class WriteObjects {

    public static void main(String[] args) {
        System.out.println("WriteObjects!");

        Person mike = new Person(543,"Mike");
        Person sue = new Person(12,"sue");

        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(mike);
        peopleList.add(sue);

        try(FileOutputStream fs = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fs);) {

            oos.writeObject(mike);
            oos.writeObject(sue);

            oos.writeObject(peopleList);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
