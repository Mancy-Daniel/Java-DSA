package Recursion_L1;
// Q.3 --> Product of N to 1  Q.4 --> Sum of N to 1 only Symbol changes
public class SumOfN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }
}
