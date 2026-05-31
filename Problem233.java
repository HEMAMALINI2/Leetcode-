public class Problem233{
    public static void main(String[] args){
        int num=38;
         int digit=0;
        int temp=0;
        while(num>0){
        digit+=num%10;
       num/=10;
        if(num==0 && digit>9){
            num=digit;
            digit=0;
        }

        }
       System.out.println(digit);
    }
}