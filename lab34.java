import java.util.*;
public class lab34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String total = " ";
        System.out.print("Enter number of digits: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++){
            System.out.print("Enter digit " + i + ": ");
            String digit = input.next();
            total += digit;
            if ( i == num){
                System.out.println(" ");
                System.out.println("Final Code =" + total);
                break;
            }
            
            
        }
    }
    
}
