class Solution {
    public int[][] generateMatrix(int n) {

        int[][] mat = new int[n][n];

        int fc = 0;
        int lc = n - 1;
        int fr = 0;
        int lr = n - 1;

        int k = 1;  // moved outside while

        while (fc <= lc && fr <= lr) {

            for (int j = fc; j <= lc; j++) {
                mat[fr][j] = k++;
            }
            fr++;

            for (int i = fr; i <= lr; i++) {
                mat[i][lc] = k++;
            }
            lc--;

            if (fr <= lr) {
                for (int j = lc; j >= fc; j--) {
                    mat[lr][j] = k++;
                }
            }
            lr--;

            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    mat[i][fc] = k++;
                }
            }
            fc++;
        }

        return mat; 
    }
}