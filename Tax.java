/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_75
 */
import java.util.*;
public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tax = sc.nextInt();
        if (tax > 50000) {
            tax = (tax * 10) / 100;
        } else {
            tax = (tax * 5) / 100;
        }
        System.out.println(tax);
    }
}
