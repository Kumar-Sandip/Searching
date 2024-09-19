package BasicSearching.BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int [] arr=  {10,23,46,46,55,67,85,93,123,143};
        int n = arr.length;
        int target = 85;
        int lb = n;
        int low= 0, high =n-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (arr[mid]>=target){
                lb = Math.min(lb, mid);
                high  = mid -1;
            }
            else low = mid +1;

        }
        System.out.println(lb);
    }
}
