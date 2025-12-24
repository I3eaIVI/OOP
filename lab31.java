import java.util.*;
public class lab31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter password: ");
            String pass = input.next();
            if (pass.equals("PASS2025")){
                System.out.println("Access granted.");
                break;
            } else{
                System.out.println("Try again.");
            }
            
        }
    }
    
}
