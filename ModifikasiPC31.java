import java.util.Arrays;
import java.util.Scanner;

public class ModifikasiPC31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.printf("Masukkan nilai untuk myNumbers[%d][%d]: ", i, j);
                myNumbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nIsi array myNumbers:");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        sc.close();
    }
}