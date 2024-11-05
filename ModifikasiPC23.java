import java.util.Scanner;
public class ModifikasiPC23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] penonton = new String[10][10];
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                penonton[i][j] = "";
            }
        }
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan baris: ");
        int baris = scanner.nextInt();

        System.out.print("Masukkan kolom: ");
        int kolom = scanner.nextInt();
        scanner.nextLine();

        if (baris >= 0 && baris < penonton.length && kolom >= 0 && kolom < penonton[baris].length) {
        
         }
         scanner.close();
    }
}