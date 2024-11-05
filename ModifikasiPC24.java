import java.util.Scanner;

public class ModifikasiPC24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama;
        int baris, kolom;

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); 

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
                            if (penonton[i][j] == null) {
                                System.out.print("Kursi (" + (i + 1) + "," + (j + 1) + ") kosong | ");
                            } else {
                                System.out.print("Kursi (" + (i + 1) + "," + (j + 1) + ") terisi oleh " + penonton[i][j] + " | ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return; // Exit the program

                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}