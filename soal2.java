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
public class soal2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();

        System.out.println("Jumlah deret bilangan genap dari " + batasAwal + " hingga " + batasAkhir + " adalah: " + jumlahDeretGenap(batasAwal, batasAkhir));

        input.close();
    }

    public static int jumlahDeretGenap(int batasAwal, int batasAkhir) {
        int jumlah = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                jumlah += i;
            }
        }
        return jumlah;
    }

}
