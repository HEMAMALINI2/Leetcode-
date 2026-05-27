public class Problem191{
    public static void main(String[] args) {
        int n=11;
      int count=0;
        String r="";
        while(n>0){
           int temp=n/2;
           r+=n%2;
           n=temp;
        }

        for(int i=0;i<r.length();i++){
            if((r.charAt(i)+"").equals("1")){
                count++;
            }
        } 

        System.out.println(count);  
    }
}