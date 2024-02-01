package Charan.Practice.ZohoPrep;

//package Charan.Practice.ZohoPrep;
//
//public class FindSubstringIn2D {
//    public static void main(String[] args) {
//        char[][] arr = stringTo2D("WELCOMETOZOHOCORPORATIONS");
//        System.out.println(findSubstringIn2D(arr, "TOO"));
//    }
//
//    public static String findSubstringIn2D(char[][] arr, String s) {
//        String sb = "";
//        int len = s.length();
//        int rowLen = arr.length;
//        int colLen = arr[0].length;
//
//        return sb;
//    }
//
//    public static char[][] stringTo2D(String s) {
//        int len = s.length();
//        int rows = (int) Math.sqrt(findNearestPerfectSq(len));
//        char[][] arr = new char[rows][rows];
//        int index = 0;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < rows; j++) {
//                if (index == len) {
//                    return arr;
//                } else {
//                    arr[i][j] = s.charAt(index++);
//                }
//            }
//        }
//        return arr;
//    }
//
//    public static int findNearestPerfectSq(int n) {
//        if (isPerfect(n)) {
//            return n;
//        } else {
//            return findNearestPerfectSq(++n);
//        }
//    }
//
//    public static boolean isPerfect(int n) {
//        int num = (int) Math.sqrt(n);
//        return num * num == n;
//    }
//}
public class FindSubstringIn2D {
    static int[] x = {0, 1};
    static int[] y = {1, 0};

    public static void main(String[] args) {
        char[][] arr = {
                {'W', 'E', 'L', 'C', 'O'},
                {'M', 'E', 'T', 'O', 'Z'},
                {'O', 'H', 'O', 'C', 'O'},
                {'R', 'P', 'O', 'R', 'A'},
                {'T', 'I', 'O', 'N'}
        };
        String word = "TOOR";
        searchWord(arr, word);
    }

    public static void searchWord(char[][] grid, String word) {
        int N = grid.length;
        int M = grid[0].length;

        // Consider every point as starting point and search given word
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < M; col++) {
                if (search2D(grid, row, col, word)) {
                    System.out.println("Start index : <" + row + "," + col + ">");
                    System.out.println("End index: <" + (row + word.length() - 1) + "," + col + ">");
                }
            }
        }
    }

    public static boolean search2D(char[][] grid, int row, int col, String word) {
        int N = grid.length;
        int M = grid[0].length;

        // If first character of word doesn't match with given starting point in grid.
        if (grid[row][col] != word.charAt(0))
            return false;

        // Search word in all 8 directions starting from (row, col)
        for (int dir = 0; dir < 2; dir++) {
            // Initialize starting point for current direction
            int k, rd = row + x[dir], cd = col + y[dir];

            // First character is already checked, match remaining characters
            for (k = 1; k < word.length(); k++) {
                // If out of bound break
                if (rd >= N || rd < 0 || cd >= M || cd < 0)
                    break;

                // If not matched, break
                if (grid[rd][cd] != word.charAt(k))
                    break;

                // Moving in particular direction
                rd += x[dir];
                cd += y[dir];
            }

            // If all character matched, then value of must be equal to length of word
            if (k == word.length())
                return true;
        }
        return false;
    }
}
