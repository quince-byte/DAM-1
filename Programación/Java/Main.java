import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("¿Cómo te llamas? ");
            String name = scanner.nextLine();
            System.out.println("Hola " + name);
        }
    }
}