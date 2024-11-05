import java.util.Scanner;

public class BioskopWithScanner03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan baris: ");
            String baris = scanner.nextLine();
            System.out.print("Masukkan kolom: ");
            String kolom = scanner.nextLine();

            penonton[Integer.parseInt(baris)-1][Integer.parseInt(kolom)-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            String next = scanner.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}