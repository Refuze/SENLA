package second;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Создайте программу, которая будет вычислять и выводить на
экран простые множители, из которых состоит целое число,
введенное пользователем. Если введенное число не целое, то нужно
сообщать пользователю об ошибке.*/

public class Divider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            int divisor = 2;
            StringBuilder string = new StringBuilder();
            while (number != 1) {
                if (number % divisor == 0){
                    string.append(divisor).append(" ");
                    while (number % divisor == 0)
                        number /= divisor;
                } else if (divisor == 2){
                    divisor++;
                } else {
                    divisor += 2;
                }
            }
            System.out.println(string);
        } catch (InputMismatchException e){
            System.out.println("Введено дробное число");
        }
    }
}
