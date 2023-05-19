package Charan.Foobar;
/*
You're almost ready to make your move to destroy the LAMBCHOP doomsday device, but the security checkpoints that guard the underlying systems of the LAMBCHOP are going to be a problem. You were able to take one down without tripping any alarms, which is great! Except that as Commander Lambda's assistant, you've learned that the checkpoints are about to come under automated review, which means that your sabotage will be discovered and your cover blown -- unless you can trick the automated review system.To trick the system, you'll need to write a program to return the same security checksum that the bunny trainers would have after they would have checked all the workers through. Fortunately, Commander Lambda's desire for efficiency won't allow for hours-long lines, so the trainers at the checkpoint have found ways to quicken the pass-through rate. Instead of checking each and every worker coming through, the bunny trainers instead go over everyone in line while noting their worker IDs, then allow the line to fill back up. Once they've done that they go over the line again, this time leaving off the last worker. They continue doing this, leaving off one more worker from the line each time but recording the worker IDs of those they do check, until they skip the entire line, at which point they XOR the IDs of all the workers they noted into a checksum and then take off for lunch. Fortunately, the workers' orderly nature causes them to always line up in numerical order without any gaps.For example, if the first worker in line has ID 0 and the security checkpoint line holds three workers, the process would look like this:0 1 2 /3 4 / 56 / 7 8where the trainers' XOR (^) checksum is 0^1^2^3^4^6 == 2.Likewise, if the first worker has ID 17 and the checkpoint holds four workers, the process would look like:17 18 19 20 /21 22 23 / 2425 26 / 27 2829 / 30 31 32which produces the checksum 17^18^19^20^21^22^23^25^26^29 == 14.All worker IDs (including the first worker) are between 0 and 2000000000 inclusive, and the checkpoint line will always be at least 1 worker long.With this information, write a function solution(start, length) that will cover for the missing security checkpoint by outputting the same checksum the trainers would normally submit before lunch. You have just enough time to find out the ID of the first worker to be checked (start) and the length of the line (length) before the automatic review occurs, so your program must generate the proper checksum with just those two values.

Your code should pass the following test cases.Note that it will also be run against hidden test cases not shown here.
Input:Solution.solution(17, 4)Output:    14
Input:Solution.solution(0, 3)Output:    2
Your code will be compiled using standard Java 8. All tests will be run by calling the solution() method inside the Solution class
Execution time is limited.
Wildcard imports and some specific classes are restricted (e.g. java.lang.ClassLoader). You will receive an error when you verify your solution if you have used a restricted class.
Third-party libraries, input/output operations, spawning threads or processes and changes to the execution environment are not allowed.
Your solution must be under 32000 characters in length including new lines and other non-printing characters.
*/
import java.lang.Math;
public class Foobar3c {
//public class Solution {

    public static int solution(int start, int length) {
        if (length == 1) return start;
        return predictResult(start, length);
    }

    public static int predictResult(int start, int length) {
        int result = 0;
        for (int bit = 0; bit <= maxnob(start, length); bit++) {
            result += Math.pow(2, bit) * predictobr(start, length, bit);
        }
        return result;
    }

    public static int maxnob(int start, int length) {
        int maxNum = start + length * length - 1;
        return (int) (Math.ceil(Math.log(maxNum) / Math.log(2))) + 1;
    }

    public static int predictobr(int start, int length, int bitNum) {
        int sumOfBits = 0;
        for (int[] row : iterateRows(start, length)) {
            sumOfBits += getsobrange(row[0], row[1], bitNum);
        }
        return sumOfBits % 2;
    }

    public static Iterable<int[]> iterateRows(int start, int length) {
        return () -> new RowIterator(start, length);
    }

    public static int getsobrange(int start, int finish, int bitNumber) {
        int before = predictsob(start - 1, bitNumber);
        int bfinish = predictsob(finish, bitNumber);
        return bfinish - before;
    }

    public static int predictsob(int num, int bitNumber) {
        if (bitNumber == 0) return (num + 1) / 2;
        int divisor = (int) Math.pow(2, bitNumber);
        num -= divisor;
        int quotient = (num / divisor) + 1;
        int result = quotient * (divisor / 2);
        if (quotient % 2 == 1) result += num % divisor - (int) Math.pow(2, bitNumber - 1) + 1;
        return result;
    }
}

class RowIterator implements java.util.Iterator<int[]> {
    private int start;
    private int length;
    private int currentRow;

    public RowIterator(int start, int length) {
        this.start = start;
        this.length = length;
        this.currentRow = 0;
    }

    @Override
    public boolean hasNext() {
        return currentRow < length;
    }

    @Override
    public int[] next() {
        int firstNumber = start + currentRow * length;
        int lastNeededNumber = firstNumber + length - currentRow;
        int[] row = { firstNumber, lastNeededNumber - 1 };
        currentRow++;
        return row;
    }
}
