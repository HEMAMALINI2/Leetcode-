public class Problem66{
    public static void main(String[] args){
        int[] arr={7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        
        String n="";
        long temp=0;
        for(int i=0;i<arr.length;i++){
             n+=arr[i]+"";
            
        }
        temp=Long.parseLong(n)+1;
        System.out.println(temp);
        n=temp+"";
        System.out.println(n);
        
    }
}