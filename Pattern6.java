import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int num = i * (i + 1) / 2;
            for (int j = 0; j < i; j++) {
                System.out.print(num-- + " ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            int num = i * (i + 1) / 2;
            for (int j = 0; j < i; j++) {
                System.out.print(num-- + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
