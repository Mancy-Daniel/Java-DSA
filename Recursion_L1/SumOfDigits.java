package Recursion_L1;
// Q.5 um of Digits
public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12888885;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sum(n/10);
    }
}
