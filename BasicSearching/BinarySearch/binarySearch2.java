package BasicSearching.BinarySearch;

public class binarySearch2 {
    public static void main(String[] args) {
        int[] arr = {23, 34, 35, 38, 48, 56, 66, 78};
        int target = 38;
        int n = arr.length;
        int low = 0, high = n - 1;
        boolean flag = false; // array element present or not present
        int ans = -1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==target)                   {
                ans = mid;
                flag = true; break;
            }
            else if (arr[mid]>target) high =mid-1;
            else if (arr[mid]<target) low = mid+1;
                


        }
        if (flag == true) System.out.print("Element Present in"+" " );
        else System.out.print("Element  is not present in"+" ");
        System.out.println("index:"+ans);
    }
}
