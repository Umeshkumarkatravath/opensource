import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
                int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("The sum of the numbers is: " + sum);
                scanner.close();
    }
}
