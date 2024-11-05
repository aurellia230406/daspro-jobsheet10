public class Bioskop03 {
    public static void main(String[] args) {
        String[][] penonton = {
            {"Amin", "Bena"},
            {"Candra", "Dela"},
            {"Eka", "Farhan"},
            {"Gisel", "Hana"}
        };

        System.out.println("Nama penonton pada setiap baris:");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
        }
    }
}