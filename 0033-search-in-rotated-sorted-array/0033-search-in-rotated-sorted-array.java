class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findPivot(nums);

        // Agar array rotated nahi hai
        if (pivot == 0) {
            return bs(nums, 0, n - 1, target);
        }

        // Agar target left half mein hai
        if (target >= nums[0] && target <= nums[pivot - 1]) {
            return bs(nums, 0, pivot - 1, target);
        }

        // Agar target right half mein hai
        return bs(nums, pivot, n - 1, target);
    }

    // Pivot = smallest element index
    private int findPivot(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low; // pivot index
    }

    // Normal binary search
    private int bs(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
