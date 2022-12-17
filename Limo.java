public class Limo extends Car {

    Limo(String color) {
        super("limosine",color, 10);
        count = 1000; 
    }
    @Override
    public boolean isFamilyCar() {
        super.isFamilyCar(); 
        System.out.println("Limo is not a family car"  + color);
        return false; 
    }
}
