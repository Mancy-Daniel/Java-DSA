package Recursion_L1;
// Q.8 Palindrome or not
public class Palindrome {
    public static void main(String[] args) {
        int n = 52525;
        System.out.println(palin(n));
    }
    static boolean palin(int n){
        return n == rev2(n);
    }
    static int rev2(int n){
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        // The number of digits is calculated only once and passed to the helper method.
        // This avoids recalculating the number of digits on each recursive call.
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }
    static int helper(int n, int digits){
        if(n % 10 ==n){
            return n;
        }
        int rem = n % 10;
        return (int)(rem * Math.pow(10, digits - 1) + helper(n/10,digits-1));
    }
}
