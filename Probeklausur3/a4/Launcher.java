import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Launcher {
    public static void main(String[] args) {
        Person p1 = new Person("Rebecka", "Mishra", "Leipzig");
        Person p2 = new Person("Jakob", "Cox", "Halle");

        System.out.println("Vorname: " + p1.getVorname() + ", Nachname: " + p1.getNachname() + ", Wohnort: " + p1.getWohnort());
        System.out.println("Vorname: " + p2.getVorname() + ", Nachname: " + p2.getNachname() + ", Wohnort: " + p2.getWohnort());

        try {
            FileOutputStream fos = new FileOutputStream("personen.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.writeObject(p2);
            fos.close();
            oos.close();
            FileInputStream fs = new FileInputStream("personen.ser");
		    ObjectInputStream is = new ObjectInputStream(fs);
            Person newP1 = (Person) is.readObject();
            Person newP2 = (Person) is.readObject();
            System.out.println("Vorname: " + newP1.getVorname() + ", Nachname: " + newP1.getNachname() + ", Wohnort: " + newP1.getWohnort());
            System.out.println("Vorname: " + newP2.getVorname() + ", Nachname: " + newP2.getNachname() + ", Wohnort: " + newP2.getWohnort());
            fs.close();
            is.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
