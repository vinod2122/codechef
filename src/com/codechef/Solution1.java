package com.codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int D = sc.nextInt(); // Discount per trial session
            int X = sc.nextInt(); // Initial cost of membership
            int Y = sc.nextInt(); // Chef's budget

            // Check if membership is already affordable
            if (Y >= X) {
                System.out.println(0);
                continue;
            }

            boolean isPossible = false;
            for (int sessions = 1; sessions <= 100; sessions++) {
                double discountedPrice = X * (1 - (D / 100.0) * sessions); // Calculate discounted membership price
                int remainingBudget = Y - sessions; // Remaining budget after trial sessions

                if (discountedPrice <= remainingBudget && remainingBudget >= 0) {
                    System.out.println(sessions);
                    isPossible = true;
                    break;
                }
            }

            if (!isPossible) {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
