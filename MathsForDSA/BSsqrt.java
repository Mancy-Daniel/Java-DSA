package MathsForDSA;

public class BSsqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        //System.out.println(search(n,p));
        System.out.printf("%.3f", search(n,p));

    }
    static double search(int x, int p){
        int start = 0;
        int end = x;
        double root = 0.0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if((mid * mid) == x){
                root = mid;
            }
            else if((mid * mid) > x){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while(root * root < x){
                root = root + incr;
            }
            root = root - incr;
            incr = incr / 10;
        }
        return root;
    }
}
