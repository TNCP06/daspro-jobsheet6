import java.util.Scanner;

public class latihan2_week6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte jenBuku, jumBuku;
        double jumDiskon = 0, harga=100;

        System.out.println("Daftar Buku yang tersedia: ");
        System.out.println("1. Kamus");
        System.out.println("2. Novel");
        System.out.println("3. Jenis lain");
        System.out.print("Masukkan nomor jenis buku: ");
        jenBuku = input.nextByte();
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumBuku = input.nextByte();

        if (jenBuku == 1 || jenBuku == 2) {
            if (jenBuku == 1) {
                if (jumBuku > 2) {
                    jumDiskon += 10;
                    harga -= jumDiskon;
                    jumDiskon += (harga*0.02);
                    System.out.println("Jumlah diskon: "+jumDiskon+"%");
                } else {
                    jumDiskon += 10;
                    System.out.println("Jumlah diskon: "+jumDiskon+"%");
                }
            } else {
                if (jumBuku > 0 && jumBuku <= 3) {
                    jumDiskon += 7;
                    harga -= jumDiskon;
                    jumDiskon += (harga*0.01);
                    System.out.println("Jumlah diskon: "+jumDiskon+"%");
                } else {
                    jumDiskon += 7;
                    harga -= jumDiskon;
                    jumDiskon += (harga*0.02);
                    System.out.println("Jumlah diskon: "+jumDiskon+"%");
                }
            }
        } else {
            if (jumBuku > 3) {
                jumDiskon += 5;
                System.out.println("Jumlah diskon: "+jumDiskon+"%");
            } else {
                System.out.println("Jumlah diskon: "+jumDiskon+"%");
            }
        }
        input.close();
    }
}