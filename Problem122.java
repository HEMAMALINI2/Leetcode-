public class Problem122{
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
         int profit=0;
        int buy=0,sell=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
               buy=prices[i];
               sell=prices[i+1];
            }

         if(buy>0 || sell>0){
                profit+=sell-buy;
                buy=0;
                sell=0;
            }
        }
        System.out.println(profit);
    }
}