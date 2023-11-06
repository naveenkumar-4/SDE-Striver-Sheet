package sdestriverSheet;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
        int n = nums.length; // Length of the array.

        // Step 1: Find the break point:
        int ind = -1; // Break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                // Index i is the break point.
                ind = i;
                break;
            }
        }

        // If there's no break point:
        if (ind == -1) {
            // Reverse the whole array:
            reverseArray(nums, 0, n - 1);
            return;
        }

        // Step 2: Find the next greater element and swap it with nums[ind]:
        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                int tmp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = tmp;
                break;
            }
        }

        // Step 3: Reverse the right half:
        reverseArray(nums, ind + 1, n - 1);
    }

    private void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
