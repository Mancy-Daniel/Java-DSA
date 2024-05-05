class Training {
	static void transpose(int m, int n, int a[][])
	{

			for (i = 0; i < m; i++) {
				for (j = 0 ; j < n; j++) {
					System.out.print(a[m - 1][i] + " ");
				}
        System.out.println();
			}
	}
	public static void main(String args[])
	{
		int r=4;
		int c=4;
		int a[][] = { { 1, 2, 3, 4 },
					{ 5, 6, 7, 8 },
					{ 9, 10, 11, 12 },
					{ 13, 14, 15, 16 } };
		transpose(r,c,a);
	}
}