import java.util.Scanner;
class Bilangan {
    int angka;

    public Bilangan(int angka) {
        this.angka = angka;
    }

    public boolean bilanganprima() {
        if (angka <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}

public class CekBilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bilangan[] cek = new Bilangan[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            int angka = input.nextInt();

            cek[i] = new Bilangan(angka);
        }

        System.out.println("\nHasil Pengecekan Bilangan Prima:");
        for (int i = 0; i < 5; i++) {
            boolean bilanganprima = cek[i].bilanganprima();
            System.out.println("Bilangan " + cek[i].angka + " adalah bilangan prima: " + bilanganprima);
        }
        input.close();
    }
}
