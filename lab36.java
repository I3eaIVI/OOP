import java.util.*;
public class lab36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String allChar = "",smallChar = "";
        while (true){
            System.out.print("Enter a character: ");
            char ch = input.next().charAt(0);
            if (ch < 'a' || ch > 'z'){
                System.out.println("Invalid input. Only lowercase a-z are allowed.");
                continue;
            }
            if (ch == 'z'){
                break;
            }
            allChar += ch;
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                smallChar += ch;
            }
        }
        System.out.println(" ");
        System.out.println("All characters entered: " + allChar);
        System.out.println("Consonants only: " + smallChar);
    }
    
}
