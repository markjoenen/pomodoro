package chapter9;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake birthdayCake = new BirthdayCake("Chocolate");
        birthdayCake.setCandles(3);
        birthdayCake.setPrice(25.5);

        WeddingCake weddingCake = new WeddingCake("Vanilla");
        weddingCake.setTiers(5);
        weddingCake.setPrice(125.99);

        System.out.println("Birthday Cake");
        System.out.println("Flavor: " + birthdayCake.getFlavor());
        System.out.println("Price: " + birthdayCake.getPrice());
        System.out.println("Candle qty: " + birthdayCake.getCandles());
        System.out.println();

        System.out.println("Wedding Cake");
        System.out.println("Flavor: " + weddingCake.getFlavor());
        System.out.println("Price: " + weddingCake.getPrice());
        System.out.println("Tier Level: " + weddingCake.getTiers());
        System.out.println();
    }
}
