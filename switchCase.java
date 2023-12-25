import java.util.*;
public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a button");
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Welcone to 1st leage");
                break;
            case 2:
                System.out.println("Welcone to 2nd leage");
                break;
            case 3:
                System.out.println("Welcone to 3rd leage");
                break;
            default:
                System.out.println("invalid button");
                        
        } 
    }
}
