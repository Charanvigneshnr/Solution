package Charan.Test;

public class CheckSubstringInTwoDArray {
    public static void main(String[] args) {
        char[][] arr = {
                {'W', 'E', 'L', 'C', 'O'},
                {'M', 'E', 'T', 'O', 'Z'},
                {'O', 'H', 'O', 'C', 'O'},
                {'R', 'P', 'O', 'R', 'A'},
                {'T', 'I', 'O', 'N', 'S'}};
        System.out.println(checkIn2DArray(arr, "TOO"));
    }

    private static boolean checkIn2DArray(char[][] arr, String s) {
        int rowLen = arr.length;
        int colLen = arr[0].length;
        int i, j;
        for (i = 0; i < rowLen; i++) {
            for (j = 0; j < colLen; j++) {
                if (arr[i][j] == s.charAt(0)) {
                    canMove(arr, i, j, s);
                }
            }
        }
        return false;
    }

    public static boolean canMove(char[][] arr, int x, int y, String s) {
        int rowLen = arr.length;
        int colLen = arr[0].length;
        int i, j;
        int index = 1;
        for (i = 0; i < rowLen; i++) {
            for (j = 0; j < colLen; j++) {
                if (i == 0 && j == 0) {
                    if (arr[i + 1][j] == s.charAt(index++) || arr[i][j + 1] == s.charAt(index++)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
