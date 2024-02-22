import java.util.Scanner;

public class JPA102 {
    public static void main(String[] args) {
        System.out.println("Please input:");
        Scanner number = new Scanner(System.in);
        double kg = number.nextDouble();
        double pond = kg*2.20462;
        System.out.println(kg+" kg = "+pond+" ponds");
        
    }
    
}
