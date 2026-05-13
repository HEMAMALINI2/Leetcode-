import java.lang.String;
public class MainClass {
  public static void main(String[] args) {
    String s="1b1";
    String l="";
    int j=0;
   s= s.toLowerCase();
       boolean ans=false;
       String rev="";
       for(int i=s.length()-1;i>=0;i--){
        char a = s.charAt(i);
        char b= s.charAt(j);
        if(Character.isLetterOrDigit(a) && (a+"")!=null){
            rev+=a+"";
        }
        if(Character.isLetter(b) && (b+"")!=null){
           l+=b+"";
          }
        j++;
       }
       if(l.equals(rev)){
        ans=true;
       }
  }
}