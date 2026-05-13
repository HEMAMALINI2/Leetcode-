public class Problem387{
    public static void main(String[] args) {
        String s="leetcode";
         int index = -1;
      if(s.length()==1){
        index=0;
      }
      else{
       for(int i=0;i<s.length();i++)
    {
       boolean flag=true;
        String temp=s.substring(i+1,s.length());
        String temp2=s.substring(0,i);
        flag=temp.contains(s.charAt(i)+"");
         if(!flag && i==0){ 
          index=i;
          break;
        }
        else if(i!=0 && !(temp2.contains(s.charAt(i)+"")) && !flag){
          index=i;
          break;
          }  }
      }
    }
}