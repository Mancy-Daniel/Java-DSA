package Recursion_L1;
// Q.07 -- Reverse the number
public class Reverse {
    public static void main(String[] args) {
        int n = 3456;
        System.out.println(n);
    }
    static int sum = 0;
    static void reverse(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n/10);

    }
}
