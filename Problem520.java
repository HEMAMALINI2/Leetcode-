public class Problem520{
    public static void main(String[] args) {
      String word="USA";
      boolean ans=false;
        String temp1 = word.toUpperCase();
        String temp2 = word.toLowerCase();
        String k = word.charAt(0)+"".toUpperCase();
        String temp3 = word.substring(1,word.length()).toLowerCase();
        if(temp1.equals(word)){
            ans=true;
        }
        else if(temp2.equals(word)){
            ans=true;
        }
        else if((word.charAt(0)+"").equals(k) && word.substring(1,word.length()).equals(temp3)){
             ans=true;
        }

        System.out.println(ans);   
    }
}