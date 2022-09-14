public class Launcher {
    
    public static void main(String[] args) {
        Kunde kunde = new Kunde("Hugo Meier", "Hauptstr. 12, 40880 Ratingen");
        Konto konto = new Konto(4711, 10000.0);

        konto.setKunde(kunde);
        Konto clonedKonto = null;

        try {
            clonedKonto = konto.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        clonedKonto.getKunde().setAdresse("Hauptstr. 42, 40880 Ratingen");
        System.out.println("Konto 1:");
        System.out.println(konto.getId());
        System.out.println(konto.getSaldo());
        System.out.println(konto.getKunde().getName());
        System.out.println(konto.getKunde().getAdresse());
        System.out.println("geklontes Konto:");
        System.out.println(clonedKonto.getId());
        System.out.println(clonedKonto.getSaldo());
        System.out.println(clonedKonto.getKunde().getName());
        System.out.println(clonedKonto.getKunde().getAdresse());
        System.out.println(konto.equals(clonedKonto));
    }
}
