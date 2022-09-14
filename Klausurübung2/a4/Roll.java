public class Roll {
    public static void main(String[] args) {
        Die w1 = new Die();
        Die w2 = new Die();
        Die w3 = new Die(10);
        w1.roll();
        w2.roll();
        w3.roll();
        System.out.println(w1.equals(w2));
        System.out.println(w3.toString());
        Die w4 = new Die(0, 5);
    }
}
