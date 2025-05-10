import java.util.Scanner;

public class WheatherAdvisor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Start of range: ");
        int start = scanner.nextInt();

        System.out.print("End of range: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzzBoom");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
