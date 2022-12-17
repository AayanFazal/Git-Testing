public class Car {
    private String name; 
    protected String color; 
    int passengers;
    static int count = 0; 
    Family members_in_fam ; 
   
    enum Family{ 
        TWO, 
        FOUR, 
        NONE, 
    }

Car (String name, String color, int passengers) { 
this.name = name; 
this.color = color;
this.passengers = passengers; 
count++;  
}
public boolean isFamilyCar(){ 
    switch (members_in_fam){ 
        case TWO: 
        System.out.println("Two people in family");
        break; 
        case FOUR: 
        System.out.println("4 people in family"); 
        break;
        case NONE:
        System.out.println("value is NONE");
        break;

        default: 
        System.out.println("Default is running");
        break; 
    
    }
    return false; 
}
}
