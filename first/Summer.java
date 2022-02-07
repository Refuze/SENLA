package first;
import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))){
                sum += string.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
