//2. Best Time To Buy Sell Stock
package Charan.Blind75;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(buySellStock(arr));
    }

    public static int buySellStock(int[] arr) {
        int len = arr.length, left = 0, right = 1, profit, maxProfit = Integer.MIN_VALUE;
        while (right < len) {
            if (arr[left] < arr[right]) {
                profit = arr[right] - arr[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left++;
            }
            right++;
        }
        return maxProfit;
    }
}

/*
Idea:
1. Two pointers
2. Left ptr: Day we buy, Right ptr: Day we sell
3. If (Right<Left) then Right++ and Left=Right
4. Else return maximum profit as Math.max(arr[left], arr[right])
 */