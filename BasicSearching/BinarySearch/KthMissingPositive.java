package BasicSearching.BinarySearch;

import java.util.HashSet;
import java.util.Set;

public class KthMissingPositive {
    public int findKthPositive(int[] nums, int k) {
        // Create a set to store the positive numbers in the array
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        // Initialize the counter for missing positive numbers
        int missingCount = 0;

        // Initialize the current number to check
        int currentNum = 1;

        // Loop until we find the kth missing positive number
        while (true) {
            // If the current number is not in the set, it's a missing positive number
            if (!numSet.contains(currentNum)) {
                // Increment the missing count
                missingCount++;

                // If we've reached the kth missing positive number, return it
                if (missingCount == k) {
                    return currentNum;
                }
            }

            // Increment the current number
            currentNum++;

        }
    }


}