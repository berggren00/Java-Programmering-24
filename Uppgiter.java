import java.util.Scanner;

// public class Vecka35Uppgifter {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Skriv in ett tal: ");
//         int tal = scanner.nextInt();

//         if (tal > 0) {
//             System.out.println("Talet är positivt.");
//         } else if (tal < 0) {
//             System.out.println("Talet är negativt.");
//         } else {
//             System.out.println("Talet är noll.");
//         }
//         scanner.close();
//     } 
// } 

public class Uppgiter {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Write a number: ");
    int num = scanner.nextInt();
    if (num > 0) {System.out.println("The number is positive");
} else if (num < 0) {
    System.out.println("The number is negative");
} else {
    System.out.println("The number is 0");
}
}
}