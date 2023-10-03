import java.util.Scanner;

public class Pemilihan2Percobaan227 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Masukkan sudut1: ");
        sudut1 = input27.nextFloat();
        System.out.print("Masukkan sudut2: ");
        sudut2 = input27.nextFloat();
        System.out.print("Masukkan sudut3: ");
        sudut3 = input27.nextFloat();

        totalSudut = sudut1+sudut2+sudut3;

        if (totalSudut == 180) {
            if (sudut1==90 || sudut2==90 || sudut3==90) {
                System.out.println("Segitiga Siku-Siku");
            } else if (sudut1==60 && sudut2==60 && sudut3==60) {
                System.out.println("Segitiga Sama Sisi");
            } else if (sudut1==sudut2 || sudut2==sudut3 || sudut3==sudut1) {
                System.out.println("Segitiga Sama Kaki");
            } else {
                System.out.println("Segitiga Sembarang");                
            }
        } else {
            System.out.println("Bukan Segitiga");
        }

        input27.close();
    }
}