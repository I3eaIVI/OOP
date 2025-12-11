import java.util.*;
public class Lab14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ex1,ex2,hour,sec,minute;
        System.out.println("Enter your execise time 1: " + (ex1 = sc.nextInt()));
        System.out.println("Enter your execise time 2: " + (ex2 = sc.nextInt()));
        ex1 = ex1 + ex2;
        hour = ex1 / 3600;
        minute = (ex1 % 3600) / 60;
        sec = ex1 % 60;
        System.out.println("It is " + hour + " hours " + minute + " minutes and " + sec + " seconds.");
    }
    
}
