import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("test.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Mitarbeiter> woi = (ArrayList<Mitarbeiter>) ois.readObject();
    
            for(int i=0;i<woi.size();i++){
                System.out.println("Eintrag " + (i+1) + ": ");
                System.out.println(woi.get(i).getId());
                System.out.println(woi.get(i).getName());
                System.out.println(woi.get(i).getGeburtstag());
                System.out.println(woi.get(i).getAdresse().getOrt());
                System.out.println(woi.get(i).getAdresse().getPlz());
                System.out.println(woi.get(i).getAdresse().getStrasze());
                System.out.println(woi.get(i).getKontakte());
                System.out.println(woi.get(i).getPasswort());
            }
            ois.close();
        } catch (Exception ex) {
            System.out.println(ex);
        } 
        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("test.xml")));
            ArrayList<Mitarbeiter> woi2 = (ArrayList<Mitarbeiter>) decoder.readObject();
            System.out.println("von XML: ");
            for(int i=0;i<woi2.size();i++){
                System.out.println("Eintrag " + (i+1) + ": ");
                System.out.println(woi2.get(i).getId());
                System.out.println(woi2.get(i).getName());
                System.out.println(woi2.get(i).getGeburtstag());
                System.out.println(woi2.get(i).getAdresse().getOrt());
                System.out.println(woi2.get(i).getAdresse().getPlz());
                System.out.println(woi2.get(i).getAdresse().getStrasze());
                System.out.println(woi2.get(i).getKontakte());
                System.out.println(woi2.get(i).getPasswort());
            }
            decoder.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
