/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_66
 */
import java.util.*;
public class lab21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char Y;
        double money;
        System.out.print("Input your money: ");
        money = sc.nextDouble();
        System.out.print("Input your account type( A B C or Xin uppercase) : ");
        Y = sc.next().charAt(0);
        if (Y == 'A') {
            money = money + (money * 1.5 / 100);
        }else if (Y == 'B') {
            money = money + (money * 2 / 100);
        }else if (Y == 'C') {
            money = money + (money * 1.5 / 100);
        }else if (Y == 'X') {
            money = money + (money * 5 / 100);
        }
        System.out.println("Your total money in one year = " + (int)money);
    }
}
