//check the gratest no among two no
import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st no.");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd no.");
        int b = sc.nextInt();
        
        //condition === if-else if-else
        if (a == b) {
            System.out.println("equal");
        }
        else if (a > b) {
            System.out.println(a + " is greater");
        }
        else {
            System.out.println(b+" is grater");
        }

    }
    
}
