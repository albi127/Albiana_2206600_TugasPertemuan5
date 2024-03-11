/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method;
import java.util.Scanner;
/**
 *
 * @author albi
 */
public class soal1 {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.println("Saya senang belajar bahasa Java");
        }
        
        input.close();
    }
}
