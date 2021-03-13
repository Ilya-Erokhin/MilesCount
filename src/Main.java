public class Main {
    public static int bonus (int price) {
        int bonus1 = 20;
        int bonusmiles = price / bonus1;
        return bonusmiles;
    }
    public static void main (String [] args) {
        System.out.println ( "Бонусов начислено: " + bonus( 123434532));
    }
}
