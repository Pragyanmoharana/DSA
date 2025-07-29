import java.util.Arrays;

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        int[] result = new int[N * N];
        int index = 0;

        // Flatten the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[index++] = Mat[i][j];
            }
        }

        // Sort the array
        Arrays.sort(result);

        // Fill back into 2D matrix
        int[][] sortedMat = new int[N][N];
        index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sortedMat[i][j] = result[index++];
            }
        }

        return sortedMat;
    }
}
