/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class lab35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0,ex = 0 , good = 0, fair = 0, poor = 0;
        System.out.println("Enter number of students: ");
        int num = input.nextInt();
        for (int i = 1; i <= num ; i++){
            System.out.print("Enter score for student " + i + ": ");
            score = input.nextInt();
            if (score >= 80){
                System.out.println("Excellent");
                ex += 1;
            }else if (score >= 60 & score <= 79){
                System.out.println("Good");
                good += 1;
            }else if (score >= 50 & score <= 59){
                System.out.println("Fair");
                fair += 1;
            }else if (score < 50){
                System.out.println("Poor");
                poor += 1;
            }if (i == num){
                System.out.println(" ");
                System.out.println("Summary");
                System.out.println("Excellent: " + ex);
                System.out.println("Good: " + good);
                System.out.println("Fair: " + fair);
                System.out.println("Poor: " + poor);
            }
            
            
        }
    }
}
