package MathsForDSA;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(LCM(2,7));
    }
    static int GCD(int a , int b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }
    static int LCM(int a, int b){
        int lcm = (a * b)/GCD(a,b);
        return lcm;
    }
}
