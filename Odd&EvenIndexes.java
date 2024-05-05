public class Training{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int sumEven = 0, sumOdd = 0;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }
        
        System.out.println("Sum of Even Indexes: " + sumEven);
        System.out.println("Sum of Odd Indexes: " + sumOdd);
    }
}