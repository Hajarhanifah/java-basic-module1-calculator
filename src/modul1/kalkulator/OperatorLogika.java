/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1.kalkulator;

import java.util.Scanner;

/**
 *
 * @author hajarhanifah
 */
public class OperatorLogika {
    public static void main(String[] args){
        // input
        Scanner input = new Scanner(System.in);
        
        int operator1, operator2;
        boolean hasil;
        System.out.println("input operator 1 : ");
        operator1 = input.nextInt();
        System.out.println("input operator 2 : ");
        operator2 = input.nextInt();
        
        hasil = (operator1 > operator2) && (operator2 >0);
        System.out.println("apakah operator 1 > operator 2 ? " + hasil);
        hasil = (operator1 == operator2);
        System.out.println("apakah operator 1 == operator 2 ? " + hasil);
        hasil = operator1 != 0;
        System.out.println("apakah operator 1  != 0 " + hasil);
        hasil = (operator1 < operator2) || (operator2 >0);
        System.out.println("apakah operator 1  < operator2 " + hasil);
    }
}
