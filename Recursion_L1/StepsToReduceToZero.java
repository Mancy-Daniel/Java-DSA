package Recursion_L1;
// Q.10 --> https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class StepsToReduceToZero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }
}
