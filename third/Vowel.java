package third;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Vowel {
    final static Integer[] vowels = new Integer[]{65, 69, 73, 79, 85, 89, 1040, 1054, 1069, 1045, 1048, 1067, 1059, 1025, 1070,
            1071, 97, 101, 105, 111, 117, 121, 1072, 1086, 1101, 1077, 1080, 1099, 1091, 1105, 1102,1103};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(SumVowelLetter(string));
        System.out.println(SumToUpperCase(string));
    }

    public static int SumVowelLetter (String string){
        List vowelsList = new ArrayList<>(Arrays.asList(vowels));
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (vowelsList.contains((int) string.charAt(i))){
                sum++;
            }
        }
        return sum;
    }

    public static String SumSorter (String string){
        int spaceCounter = 1;
        int arrayIndex = 0;
        boolean needIteration = true;
        StringBuilder endString = new StringBuilder();

        for (char symbol : string.toCharArray()){
            if (symbol == 32)
                spaceCounter++;

        }

        StringBuilder[] stringArray = new StringBuilder[spaceCounter];
        int[] sumArray = new int[spaceCounter];

        for (int i = 0; i < spaceCounter; i++) {
            stringArray[i] = new StringBuilder();
        }

        for (char symbol : string.toCharArray()) {
            stringArray[arrayIndex].append(symbol);
            if (symbol == 32) {
                stringArray[arrayIndex].deleteCharAt(stringArray[arrayIndex].length() - 1);
                arrayIndex++;
            }
        }

        for (int i = 0; i < spaceCounter; i++) {
            sumArray[i] = SumVowelLetter(stringArray[i].toString());
        }

        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < spaceCounter; i++) {
                if (sumArray[i] > sumArray[i - 1]) {
                    swapInt(sumArray, i, i-1);
                    swapString(stringArray, i, i-1);
                    needIteration = true;
                }
            }
        }

        for (int i = 0; i < spaceCounter; i++) {
            endString.append(stringArray[i]).append(" ");
        }
        return endString.toString();
    }

    private static void swapString(StringBuilder[] array, int ind1, int ind2) {
        StringBuilder tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    private static void swapInt(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static String SumToUpperCase (String string){
        string = SumSorter(string);
        int spaceCounter = 1;
        int arrayIndex = 0;
        StringBuilder endString = new StringBuilder();
        List vowelsList = new ArrayList<>(Arrays.asList(vowels));

        for (char symbol : string.toCharArray()){
            if (symbol == 32)
                spaceCounter++;

        }
        StringBuilder[] stringArray = new StringBuilder[spaceCounter];
        for (int i = 0; i < spaceCounter; i++) {
            stringArray[i] = new StringBuilder();
        }

        for (char symbol : string.toCharArray()) {
            stringArray[arrayIndex].append(symbol);
            if (symbol == 32) {
                stringArray[arrayIndex].deleteCharAt(stringArray[arrayIndex].length() - 1);
                arrayIndex++;
            }
        }

        for (int i = 0; i < spaceCounter ; i++) {
            for (int j = 0; j < stringArray[i].length(); j++) {
                if (vowelsList.contains((int)  stringArray[i].charAt(j))){
                    stringArray[i].insert(j, Character.toUpperCase(stringArray[i].charAt(j)));
                    break;
                }
            }
        }

        for (int i = 0; i < spaceCounter; i++) {
            endString.append(stringArray[i]).append(" ");
        }
        return endString.toString();
    }
}

