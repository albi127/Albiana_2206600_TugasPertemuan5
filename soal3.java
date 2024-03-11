/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method;
import java.util.Scanner;
/**
 *
 * @author anya
 */
public class soal3 {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan a: ");
        int a = input.nextInt();
        System.out.print("Masukkan bilangan b: ");
        int b = input.nextInt();

        int pbt = hitungPBT(a, b);

        System.out.println("Pembagi Bersama Terbesar dari " + a + " dan " + b + " adalah: " + pbt);

        input.close();
    }

    public static int hitungPBT(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
