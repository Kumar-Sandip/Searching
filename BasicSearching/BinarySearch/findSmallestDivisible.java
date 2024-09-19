package BasicSearching.BinarySearch;

public class findSmallestDivisible {
    public static void main(String[] args) {
        int n = 10; // Change this value to find the smallest divisible number for a different range
        System.out.println("Smallest divisible number for range 1 to " + n + " is: " + smallestDivisibleNumber(n));
    }

    /**
     * Finds the smallest number that is divisible by all numbers from 1 to n using binary search.
     *
     * @param n The upper limit of the range.
     * @return The smallest divisible number.
     */
    public static long smallestDivisibleNumber(int n) {
        long low = 1;
        long high = Long.MAX_VALUE;
        while (low < high) {
            long mid = low + (high - low) / 2;
            if (isDivisible(mid, n)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    /**
     * Checks if a number is divisible by all numbers from 1 to n.
     *
     * @param num The number to check.
     * @param n The upper limit of the range.
     * @return True if the number is divisible, false otherwise.
     */
    public static boolean isDivisible(long num, int n) {
        for (int i = 1; i <= n; i++) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }
}
