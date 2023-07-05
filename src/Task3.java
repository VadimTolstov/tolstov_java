import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите целые числа. Для вывода передайте не целое число");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            list.add(i);
        }

        for (Integer number : list) {
            if (number % 3 == 0)
                System.out.println(number);
        }
    }
}
