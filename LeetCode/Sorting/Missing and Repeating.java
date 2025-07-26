class Solve {
    int[] findTwoElement(int[] arr, int n) {
        int repeating = -1, missing = -1;

        // First pass: mark visited indices
        for (int i = 0; i < n; i++) {
            int idx = Math.abs(arr[i]) - 1;

            if (arr[idx] < 0) {
                // This index has already been visited → repeating number
                repeating = idx + 1;
            } else {
                // Mark index as visited by negating
                arr[idx] = -arr[idx];
            }
        }

        // Second pass: check for the index which was never visited
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                // This index was not visited → missing number
                missing = i + 1;
                break;
            }
        }

        return new int[]{repeating, missing};
    }
}
