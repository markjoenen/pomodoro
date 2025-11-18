package chapter10;

public class Market {
    public static void main(String[] args) {
        Fruit orange = new Orange(100.4);
        System.out.println("Orange has calories of " + orange.getCalories());
        ((Orange) orange).unpeel();
        ((Orange) orange).removeSeeds();
        ((Orange) orange).squeeze();
        orange.makeJuice();

        Fruit watermelon = new Watermelon(400.2);
        System.out.println("Watermelon has calories of " + watermelon.getCalories());
        ((Watermelon) watermelon).slice();
        ((Watermelon) watermelon).squareCut();
        watermelon.makeJuice();
    }
}
