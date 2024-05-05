class Training {
    public static void main(String args[])
    {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Max sum is "
                           + maxSubArray(a));
    }
    static int maxSubArray(int a[])
    {
        int size = a.length;
        int max = 0, curr_max=0;

        for (int i = 0; i < size; i++) {
            curr_max = curr_max + a[i];
            if (max < curr_max)
                max = curr_max;
            if (curr_max<0)
                curr_max=0;
        }
        return max;
    }
}