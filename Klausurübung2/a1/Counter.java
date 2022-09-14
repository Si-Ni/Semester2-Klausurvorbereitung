import java.io.File;
import java.util.Scanner;
import java.util.TreeMap;

public class Counter {
    public static void main(String[] args) {
        File file = new File("gpl.txt");
        try {
            Scanner sc = new Scanner(file);
            sc.useDelimiter("[^a-zA-Z']+");
            TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
            while(sc.hasNext()) {
                String word = sc.next();
                if(tm.containsKey(word)) {
                    int frequency = tm.get(word);
                    tm.put(word, frequency + 1);
                }else {
                    tm.put(word, 1);
                }
            }
            sc.close();
            for(String elem : tm.keySet()) {
                System.out.println("Wort: " + elem + " Häufigkeit: " + tm.get(elem));
            }
            System.out.println("Anzahl der verschiedenen Wörter: " + tm.size());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}