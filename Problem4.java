import java.util.*;
public class Problem4{
    public static void main(String[] args) {
      int[] nums1= {1,2};
      int[] nums2={3,4};
      int[] arr= new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(k<arr.length){
            if(i<nums1.length){
                arr[k]=nums1[i];
                k++;
                i++;
            }
             else if(j<nums2.length){
                arr[k]=nums2[j];
                k++;
                 j++;
            }
            
           
        }
        Arrays.sort(arr);
        double res=0.0;
        if(arr.length%2==0){
             int temp=arr.length/2;
            double a = arr[temp];
            double b = arr[temp-1];
             res=(a+b)/2;
        }
        else{
             res=arr[arr.length/2];
        }

        System.out.println(res);   
    }
}