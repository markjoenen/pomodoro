package chapter10;

public class Orange extends Fruit{
    public void unpeel(){
        System.out.println("This orange has been peeled!");
    }

    public void removeSeeds(){
        System.out.println("This orange has it's seeds removed");
    }

    public void squeeze(){
        System.out.println("This has been squeezed. Ready to drink!");
    }

    public Orange(double calories){
        super(calories);
    }

    @Override
    public void makeJuice(){
        System.out.println("Orange juice is ready!");
    }
}
