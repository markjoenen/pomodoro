package chapter10;

public class Watermelon extends Fruit{
    public void slice(){
        System.out.println("Watermelon has been sliced!");
    }

    public void squareCut(){
        System.out.println("Watermelon has been cut by cubes.");
    }

    public Watermelon(double calories){
        super(calories);
    }

    @Override
    public void makeJuice(){
        System.out.println("Watermelon has been juiced!");
    }
}
