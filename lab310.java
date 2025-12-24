import java.util.*;
public class lab310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.print("Please insert a number : ");
        num = input.nextInt();
        for (int i = 1; i <= num ; i++){
            if (i % 5 == 0){
                System.out.println("|");
            } else{
                System.out.print("|");
            }
        }
    }
}
