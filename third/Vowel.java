package third;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(SumVowelLetter.SumVowelLetter(string));
        System.out.println(SumToUpperCase.SumToUpperCase(string));
    }
}
