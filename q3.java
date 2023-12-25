//Make a program that prints the table of a number that is input by the user. 
import java.util.*;
public class q3 {
    public static void main(String[] args) {
        System.out.println("Enter a No. =");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        //loops
        for (int i = 1; i <=10; i++) {
            int ans = num * i;
            System.out.println(num+"*"+i+"="+ans);
        }
    }
}
