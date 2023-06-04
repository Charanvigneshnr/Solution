/*
    The cake is not a lie!
======================

Commander Lambda has had an incredibly successful week: the first test of the LAMBCHOP doomsday device was completed AND Lambda set a new personal high score in Tetris. To celebrate, the Commander ordered cake for everyone -- even the lowliest of minions! But competition among minions is fierce, and if you don't cut exactly equal slices of cake for everyone you'll get in big trouble.

The cake is round, and decorated with M&Ms in a circle around the edge. But while the rest of the cake is uniform, the M&Ms are not: there are multiple colors, and every minion must get exactly the same sequence of M&Ms. Commander Lambda hates waste and will not tolerate any leftovers, so you also want to make sure you can serve the entire cake.

To help you best cut the cake, you have turned the sequence of colors of the M&Ms on the cake into a string: each possible letter (between a and z) corresponds to a unique color, and the sequence of M&Ms is given clockwise (the decorations form a circle around the outer edge of the cake).

Write a function called solution(s) that, given a non-empty string less than 200 characters in length describing the sequence of M&Ms, returns the maximum number of equal parts that can be cut from the cake without leaving any leftovers.

Test cases
==========
Your code should pass the following test cases.
Note that it may also be run against hidden test cases not shown here.

-- Java cases --
Input:
Solution.solution("abcabcabcabc")
Output:
    4

Input:
Solution.solution("abccbaabccba")
Output:
    2
*/


package Charan.Foobar;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Foobar1 {
    public static int solution(@NotNull String x) {
        int len = x.length();
        int cut, j;
        for (cut = 1; cut < len; cut++) {
            if (len % cut == 0) {
                List<String> list = new ArrayList<>();
                for (j = 0; j < len; j += cut) {
                    list.add(x.substring(j, j + cut));
                }
                if (list.subList(1, list.size()).equals(list.subList(0, list.size() - 1))) {
                    return list.size();
                }
            }
        }
        return 1;
    }

}
