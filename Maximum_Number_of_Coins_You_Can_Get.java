import java.util.Arrays;

public class Maximum_Number_of_Coins_You_Can_Get {
  
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
      
        int mypiles=0;
        int bob=0;
        for(int n=piles.length;n>bob;n=n-2){
            mypiles+=piles[n-2];
            bob++;
        }
       return mypiles; 
    }
}