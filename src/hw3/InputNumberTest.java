package hw3;

import java.util.Scanner;

public class InputNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ведите число: ");
            String input = scanner.next();
            if ("exit".equals(input)) {
                System.out.println("Программа завешается");
                break;
            }
            int number;
            try {
                number = Integer.parseInt(input);
            }  catch (Exception ex) {
                continue;
            }
            if (number == 5) {
                System.out.println("Число отгадано");
                break;
            }
        }
    }
}
