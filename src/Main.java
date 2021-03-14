public class Main {
    public static int bonus (int price) {
        int bonus1 = 20;
        int bonusMiles = price / bonus1;
        return bonusMiles;
    }

    public static void main (String [] args) {
        System.out.println ( "Бонусов начислено: " + bonus( 123434532));
    }
}