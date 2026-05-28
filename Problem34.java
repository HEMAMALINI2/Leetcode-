public class Problem34{
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=10;
       int[] arr ={-1,-1};
    //    int i=0,j=1;
       boolean one=false;
       boolean two=false;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            arr[0]=i;
            one=true;
            break;
        }
       }
        for(int i=0;i<nums.length;i++){
        if(nums[i]==target && arr[0]!=i){
            arr[1]=i;
            two=true;
           
        }
       }

       if(one && !two){
        arr[1]=arr[0];
       }
       else if(!one && two){
        arr[0]=arr[1];
       }

       if(nums.length==1 && nums[0]==target){
        arr[0]=0;
        arr[1]=0;
       }
       System.out.println(arr[0]+" "+arr[1]);
    }
}