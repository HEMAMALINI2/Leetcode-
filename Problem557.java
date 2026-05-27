public class Problem557{
    public static void main(String[] args) {
      String s ="Let's take LeetCode contest";
      String rev="";
        String temp="";
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)!=' ' ){
            temp+=s.charAt(i)+"";
          }
          if(s.charAt(i)==' ' || i==s.length()-1){
            for(int j=temp.length()-1;j>=0;j--){
                rev+=temp.charAt(j);
                if(j==0 && i!=s.length()-1){
                    rev+=" ";
                }
            }
            temp="";
          }
        
        } 
        System.out.println(rev);  
    }
}