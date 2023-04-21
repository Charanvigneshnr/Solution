package Charan.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class WidthOfBinaryTree {
    class Solution {
        public int WidthOfBinaryTree(TreeNode root) {
            int res = 0; // variable to hold the maximum width
            Queue<Object[]> q = new LinkedList<>(); // create a queue to perform BFS
            q.offer(new Object[]{root, 1, 0}); // add the root to the queue with its number and level
            int prevLevel = 0, prevNum = 1; // variables to keep track of the previous level and number
            while (!q.isEmpty()) { // continue until the queue is empty
                Object[] curr = q.poll(); // remove the first node from the queue
                TreeNode node = (TreeNode) curr[0]; // extract the node from the array and cast to TreeNode
                int num = (int) curr[1]; // extract the number from the array and cast to int
                int level = (int) curr[2]; // extract the level from the array and cast to int
                if (level > prevLevel) { // if the current level is greater than the previous level
                    prevLevel = level; // update the previous level to the current level
                    prevNum = num; // update the previous number to the current number
                }
                res = Math.max(res, num - prevNum + 1); // update the maximum width
                if (node.left != null) { // if the node has a left child
                    q.offer(new Object[]{node.left, 2 * num, level + 1}); // add the left child to the queue with its number and level
                }
                if (node.right != null) { // if the node has a right child
                    q.offer(new Object[]{node.right, 2 * num + 1, level + 1}); // add the right child to the queue with its number and level
                }
            }
            return res; // return the maximum width
        }
    }

}
