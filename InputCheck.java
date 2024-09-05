import java.util.Scanner;

public class InputCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv in ett tal: ");
        int tal = scanner.nextInt();

        if (tal > 0) {
            System.out.println("Talet är positivt.");
        } else if (tal < 0) {
            System.out.println("Talet är negativt.");
        } else {
            System.out.println("Talet är noll.");
        }
        scanner.close();
    }
}
