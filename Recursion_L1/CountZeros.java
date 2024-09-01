package Recursion_L1;
// Q. 9 --> count the number of zeros
public class CountZeros {
    public static void main(String[] args) {
        int n = 1000050000;
        System.out.println(zeros(n,0));
    }
    static int zeros(int n, int count){
        if(n == 0){
            return count;
        }
        if(n%10 == 0){
            return zeros(n/10,++count);
        }
        else {
            return zeros(n / 10, count);
        }
    }
}
