package second;
import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
    }
}
