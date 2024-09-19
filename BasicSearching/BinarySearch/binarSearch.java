package BasicSearching.BinarySearch;

public class binarSearch {
    public static void main(String[] args) {
        int [] arr= {23,34,35,38,48,56,66,78};
        int target =56;
        int n = arr.length;
        int low=0 ,high =n-1;

        int ans=-1;
 while (low<=high){
     int mid = (low+high)/2;
     if (arr[mid]<target) low = mid+1;
     else if (arr[mid]>target)high = mid-1;
     else if (arr[mid]== target){
         ans=mid;
         break;
     }
     }
        System.out.println(ans);


 }





    }

