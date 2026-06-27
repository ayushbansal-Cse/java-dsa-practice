class Solution {
    public int smallestDivisor(int[] arr, int threshold) {

        int low = 1;
        int high = 0;

        for (int i = 0; i < arr.length; i++) {
            high = Math.max(high, arr[i]);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += (arr[i] + mid - 1) / mid; // ceil division
            }

            if (sum > threshold) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}