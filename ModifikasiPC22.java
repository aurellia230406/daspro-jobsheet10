import java.util.Scanner;

public class ModifikasiPC22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan baris (0-3): ");
                    int baris = scanner.nextInt();
                    System.out.print("Masukkan kolom (0-1): ");
                    int kolom = scanner.nextInt();
                    scanner.nextLine(); 

                    // Validasi input baris dan kolom
                    if (baris >= 0 && baris < penonton.length && kolom >= 0 && kolom < penonton[0].length) {
                        penonton[baris][kolom] = nama;
                    } else {
                        System.out.println("Baris atau kolom tidak valid. Silakan coba lagi.");
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih lagi.");
            }
        }

        scanner.close();
    }
}