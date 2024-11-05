import java.util.Scanner;

public class ModifikasiPC25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama;
        int baris, kolom; 

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Input data penonton: ");
            System.out.println("2. Tampilkan daftar penonton: ");
            System.out.println("3. Exit: ");
            System.out.print("Pilih menu (1-3): ");
            int pilihan = scanner.nextInt(); 
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = scanner.nextLine();
                        System.out.print("Masukkan baris (1-4): ");
                        baris = scanner.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = scanner.nextInt();
                        scanner.nextLine(); 

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Baris atau kolom tidak valid. Silahkan coba lagi.");
                            continue;
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi yang dipilih sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Silahkan pilih kursi lain.");
                            continue;
                        }

                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan.");
                        break; 
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String penontonNama = penonton[i][j] != null ? penonton[i][j] : "Kosong"; 
                            System.out.print("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penontonNama + "\n");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program.");
                    scanner.close(); 
                    return; 

                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}