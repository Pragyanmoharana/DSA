class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        int repeating = -1, missing = -1;

        // Step 1: Find repeating using index marking
        for (int i = 0; i < n; i++) {
            int idx = Math.abs(arr[i]) - 1;

            if (arr[idx] < 0) {
                repeating = idx + 1;
            } else {
                arr[idx] = -arr[idx];
            }
        }

        // Step 2: Find missing (index with positive value)
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }
        
          ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }
}
