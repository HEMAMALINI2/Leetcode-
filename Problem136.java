import java.util.*;
public class Problem136{
    public static void main(String[] args){
        int[] nums ={1,2,1,2};
         int index=0;
        Arrays.sort(nums);
        int i=0;
     
        while(i<nums.length){
            int count=1;
            boolean flag=true;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    i=j+1;
                    flag=false;
                    count++;
                    break;
                }
            }
            if(count==1){
                index=nums[i];
                break;
            }
            else if(flag){
                i++;
            }
        }

        System.out.println(index);
    }
}