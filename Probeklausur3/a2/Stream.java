import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Stream {
    public static void main(String[] args) throws IOException {
        File ordner = new File("./log/uebungsklausur/");
        ordner.mkdirs();

        if(ordner.isDirectory()) {
            try {
            FileWriter fw = new FileWriter(ordner.getPath() + "/meine_log_datei.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Error Log:");
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy, HH:mm");
            Date date = new Date();
            pw.println("Error 500: Internal Error. " + dateFormat.format(date) + " Uhr");
            fw.close();
            pw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}