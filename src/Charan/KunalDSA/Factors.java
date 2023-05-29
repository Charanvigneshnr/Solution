package Charan.KunalDSA;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int x = 36;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("The factors of " + x + " are: ");
        for (int i = 1; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                if (x / i == i) {
                    System.out.print(i + " ");
                    continue;
                }
                System.out.print(i + " ");
                list.add(x / i);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
