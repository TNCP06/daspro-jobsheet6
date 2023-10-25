import java.util.Scanner;

public class latihan1_week6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2, bil3;
        String bilTerbesar = "Bilangan terbesar: ";
        
        System.out.print("Masukkan bil1: "); // input: 28
        bil1 = input.nextInt();
        System.out.print("Masukkan bil2: "); // input: 54
        bil2 = input.nextInt();
        System.out.print("Masukkan bil3: "); // input: 15
        bil3 = input.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println(bilTerbesar+bil1);
            } else {
                System.out.println(bilTerbesar+bil3);
            }
        } else if (bil2 > bil3) {
            System.out.println(bilTerbesar+bil2);   
        } else {
            System.out.println(bilTerbesar+bil3);
        }

        input.close();
    }
}