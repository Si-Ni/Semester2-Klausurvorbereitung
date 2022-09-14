public class outputFormatting {
    public static void main(String[] args) {
        namenAusgeben("Simon", "Nikolaidis");
        for(int i = 0; i <= 15; i++) {
            System.out.printf("DEC: %d \n", i);
            System.out.printf("HEX: %X \n", i);
        }
        printName("Simon", "Nikolaidis", "Leipzig", 18.70);
    }

    static void namenAusgeben(String vorname, String nachname) {
        System.out.printf("%s %S", vorname, nachname);
        System.out.printf("%n%n%n");
    }

    static void printName(String vorname, String nachname, String stadt, double alter) {
        System.out.printf("%-5s %-5s %5.3S \n%06.2f", vorname, nachname, stadt, alter);
    }
}