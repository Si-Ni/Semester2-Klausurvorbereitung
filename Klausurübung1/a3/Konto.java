public class Konto implements Cloneable {
    
    private int id;
    private double saldo;
    public Kunde kunde;

    public Konto() {

    }

    public Konto(int ktold, double saldo) {
        this.id = ktold;
        this.saldo = saldo;
    }

    public void add(double betrag) {
        this.saldo += betrag;
    }

    public boolean equals(Konto konto) {
        return konto instanceof Konto && this.id == konto.id;
    }

    public int hashCode() {
        return this.id % 100;
    }

    @Override
    public Konto clone() throws CloneNotSupportedException {
        Konto cloned = (Konto) super.clone();
        cloned.kunde = this.kunde.clone();
        return cloned;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
}
