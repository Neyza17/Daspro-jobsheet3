import java.util.Scanner;

public class PemilihanBilangan17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        
       // Menggunakan ternary operator
        String hasil = (bilangan % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Bilangan tersebut adalah: " + hasil);
    }
}
