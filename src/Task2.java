import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        switch (name) {
            case "Вячеслав":
                System.out.println("Привет, Вячеслав");
            default:
                System.out.println("Нет такого имени");
        }
    }
}
