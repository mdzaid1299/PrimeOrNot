import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("enter a integer");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime");
        } else System.out.println("not prime");
    }
}