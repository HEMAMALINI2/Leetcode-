public class Problem434{
    public static void main(String[] args) {
        String s ="Hello, my name is John";
        int count=1;
        s=s.trim();
        if(s.length()==0 || s.isBlank()){
            count=0;
        }
        else{
             for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
               count++;
            }
        }
        } 
    }
}