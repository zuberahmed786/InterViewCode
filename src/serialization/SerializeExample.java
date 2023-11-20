package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeExample {

    public static void main(String[] args) {
        Q1 q1 = new Q1("Zuber",28);
        try{
            FileOutputStream fos = new FileOutputStream("file.ser");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(q1);
            System.out.println("Serialize");
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            FileInputStream fis = new FileInputStream("file.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Q1 q2 = (Q1) ois.readObject();

            System.out.println("Name "+q2.getName());
            System.out.println("Age "+q2.getAge());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
