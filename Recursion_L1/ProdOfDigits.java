package Recursion_L1;
// Q.6 --> Product of Digits
public class ProdOfDigits {
    public static void main(String[] args) {
        int n = 555;
        System.out.println(prod(n));
    }
    static int prod(int n){
        if(n == 0){
            return 1;
        }
        return n%10 * prod(n/10);
    }
}
