import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class UrlReader {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.ba-leipzig.de/");
            URLConnection connection = url.openConnection();
            InputStreamReader is = new InputStreamReader(connection.getInputStream());
            Scanner sc = new Scanner(is);
            sc.useDelimiter("");
            int zaehler = 0;
            while(sc.hasNext()) {
                System.out.print(sc.next());
                zaehler++;
            }
            is.close();
            sc.close();
            System.out.println("Tokens: " + zaehler);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}