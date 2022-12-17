import java.util.Scanner;


public class App{ 
    public static void main(String[] args) {

    Car car1 = new Car("Honda", "Blue",4); 
    car1.members_in_fam = Car.Family.FOUR;

    Car car2 = new Car("Tesla","White",7); 
    car2.members_in_fam = Car.Family.TWO;
    
    Car car3 = new Car("Acura","Orange",10); 
    Car car4 = new Limo("blue"); 
    Car car5 = new Car("BMW","Red",9); 
    Car car6 = new Car("Honda","black",10); 
    System.out.println("Hello World");
    System.out.println("New change"); // made new change 
    car1.isFamilyCar(); 
    car2.isFamilyCar();
    car3.isFamilyCar(); 
    car4.isFamilyCar(); 
    car5.isFamilyCar(); 
    car6.isFamilyCar(); 

    System.out.println("You have currently looked at "+ Car.count + " cars");
    }
}