package Charan.Test;

import org.jetbrains.annotations.NotNull;

public class LabRat {

    public @NotNull String findStringVowelFirstAndLast(int input1, String[] input2) {
        String result = "";
        int count = 0;

        for (int i = 0; i < input1; i++) {
            String s = input2[i].toLowerCase();
            int len = s.length();

            char firstChar = s.charAt(0);
            char lastChar = s.charAt(len - 1);

            if ((firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') &&
                    (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u')) {
                result += s;
                count++;
            }
        }

        if (count > 1) {
            return result;
        } else {
            return "no matches found";
        }
    }
}
