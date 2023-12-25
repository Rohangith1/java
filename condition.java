import java.util.*;
public class condition {
    public static void main(String[] args) {
        //if else
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        //if age<18 => not elligible else elligible
        if (age < 18) {
            System.out.println("Hi.."+name+" You are not elligible");
        }
        else {
            System.out.println("Hi.."+name+" You are elligible");
        }
    }
}
