import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            if (age >= 21) {
                System.out.println("You get a paper wrist band.");
            }
        }

    }
}

