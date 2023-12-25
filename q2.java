//Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);
        System.out.println("Please enter Radius");
        //take the radius
        double r = ans.nextFloat();
        //area of cirle 3.14*r*r
        double area = 3.14 * r * r;
        System.out.println("Area of the circle is "+area);
        

    }
    
}
