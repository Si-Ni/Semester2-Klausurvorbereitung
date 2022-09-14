import java.io.*;

public class htmlConverter {
    public static void main(String[] args) {
        File inputFile = new File("input.html");
        File outputFile = new File("output.html");
        FileReader is = null;
        OutputStream os = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            is = new FileReader(inputFile);
            os = new FileOutputStream(outputFile);
            br = new BufferedReader(is);
            pw = new PrintWriter(outputFile);
            String contentLine = br.readLine();
	        while (contentLine != null) {
	            contentLine = contentLine.replaceAll("ä", "&auml;");
                contentLine = contentLine.replaceAll("Ä", "&Auml;");
                contentLine = contentLine.replaceAll("ö", "&ouml;");
                contentLine = contentLine.replaceAll("Ö", "&Ouml;");
                contentLine = contentLine.replaceAll("ü", "&uuml;");
                contentLine = contentLine.replaceAll("Ü", "&Uuml;");
                contentLine = contentLine.replaceAll("ß", "&szlig;");
                contentLine = contentLine.replaceAll("\"", "&quot;");
                pw.println(contentLine);
	            contentLine = br.readLine();
	        }
        } catch(Exception ex) {
            System.out.println("Es ist ein Fehler aufgetreten: ");
            System.out.println(ex);
        } finally 
            {
            try {
                if (is != null)
                    is.close();
                if (os != null)
                    os.close();
                if (br != null)
                    br.close();
                if (pw != null)
                    pw.close();
            } 
            catch (IOException ioe) {
                System.out.println("Error in closing the streams");
            }
     }
    }
}