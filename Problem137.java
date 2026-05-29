import java.util.*;
public class Problem137{
    public static void main(String[] args){
        int[] nums = {2,2,3,2};
        Arrays.sort(nums);
     int i=0,j=1;
     int ans=0;
     if(nums.length==1){
        ans=nums[0];
     }
     else{
        while(i<nums.length-1){
        if(nums[i]!=nums[j] ){
          
            if(j<nums.length-1 && nums[j+1]!=nums[j])
            {
              ans=nums[j];
            }
            else if(i!=0 && nums[i-1]!=nums[i]){
              ans=nums[i];
              
              }
            else if(j==nums.length-1){
                ans=nums[j];
            }
            else if(i==0){
               ans=nums[i];
         }
        }
        
        
        i++;
        j++;
     } 
    }
    System.out.println(ans);
    }
}