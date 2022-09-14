public class Launcher {
    
    public static void main(String[] args) {
        Kontakt[] personen = new Kontakt[5];

        personen[0] = new Kontakt("Magahet Martin", "Adelgunde-Gottsched-Weg", "Leipzig");
        personen[1] = new Kontakt("Aapo Baumhauer", "Reichelstraße", "Dresden");
        personen[2] = new Kontakt("Zakiyya Watson", "Pansastraße", "Köln");
        personen[3] = new Kontakt("Wynter Schuhart", "Lindengasse", "Hamburg");
        personen[4] = new Kontakt("Gertie Darrell", "Ahornstraße", "Berlin");

        print(personen);
        System.out.println(search(personen, "Watson"));
        System.out.println(search(personen, "Nils"));
    }

    public static void print(Kontakt[] personen) {
        for (Kontakt person : personen) {
            System.out.println(person.toString());
        }
    }

    public static int search(Kontakt[] personen, String such) {
        int i = -1;
        String n = "";

        for (int j = 0; j < personen.length; j++) {
            n = personen[j].getName();
            if (n.contains(such)) {
                i = j;
            }
        }
        return i;
    }
}
