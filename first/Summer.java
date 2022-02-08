package first;
import java.util.Scanner;

/*Напишите программу, которая возвращает сумму цифр,
присутствующих в данной строке. Если цифр нет, то возвращаемая
сумма должна быть равна 0*/

public class Summer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any line: ");

        String string = scanner.nextLine();
        int sum = 0;

        for (char symbol : string.toCharArray()) {
            if (Character.isDigit(symbol)){
                sum += symbol - '0';
            }
        }

        System.out.println("The sum of the digits present in this line: " + sum);
    }
}
