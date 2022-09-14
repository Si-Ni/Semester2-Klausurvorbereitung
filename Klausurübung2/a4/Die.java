import java.util.Random;

public class Die {
     int sides;
     int result;
    private static final int DEFAULT_SIDES = 6;
    private Random generator = new Random();

    public Die(int sides, int result) {
        assert (sides > 1 && result >= sides && result <= sides) : "Werte außerhalb des zuässigen Bereiches";
        this.sides = sides;
        this.result = result;
    }

    public Die(int sides) {
        this.sides = sides;
        this.result = 1;
    }

    public Die() {
        this(DEFAULT_SIDES);
    }

    public void roll() {
        this.result = generator.nextInt(this.sides) + 1;
    }

    public Boolean equals(Die würfel) {
        return this.sides == würfel.sides && this.result == würfel.result;
    }

    @Override
    public String toString() {
        return ("Es wurde eine " + this.result + " bei einer Seitenanzahl von " + this.sides + " Seiten gewürfelt");
    }
}