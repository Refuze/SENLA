package third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumVowelLetter {
    public static int SumVowelLetter (String string){
        Integer[] vowels = new Integer[]{65, 69, 73, 79, 85, 89, 1040, 1054, 1069, 1045, 1048, 1067, 1059, 1025, 1070,
                1071, 97, 101, 105, 111, 117, 121, 1072, 1086, 1101, 1077, 1080, 1099, 1091, 1105, 1102,1103};
        List vowelsList = new ArrayList<>(Arrays.asList(vowels));
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (vowelsList.contains((int) string.charAt(i))){
                sum++;
            }
        }
        return sum;
    }
}
