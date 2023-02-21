// shorted two array in single array
import java.util.*;
public class Q4 {
    public static void mergearray(int nums1[],int nums2[], ArrayList<Integer> arr){
        int i = 0,k = 0;
        while(i!=nums1.length-1 || k != nums2.length-1 ){
            if(nums1[i] < nums2[k]){
                arr.add(nums1[i]);
                i++;
            }else{
                arr.add(nums2[k]);
                k++;
            }

        }
        while(i!= nums1.length){
            arr.add(nums1[i]);
                i++;
        }
        while(k != nums2.length){
            arr.add(nums2[k]);
            k++;
        }
    }
    public static void print(ArrayList<Integer> arr){
        for(int i = 0; i< arr.size();i++){
            System.out.println(arr.get(i));
        }
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 5, 7, 9 };
        int nums2[] = { 3, 6, 0, 8,4 };
        ArrayList<Integer> arr = new ArrayList<>();
        mergearray(nums1, nums2, arr);
        print(arr);
    }
}
