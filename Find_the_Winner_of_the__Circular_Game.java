import java.util.ArrayList;

public class Find_the_Winner_of_the__Circular_Game {

    public int findTheWinner(int n, int k) {
        ArrayList<Integer> arlist=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arlist.add(i+1);
        }
        int temp=k;
        while(arlist.size()>1){
          
                 temp=(temp-1)%arlist.size();
               arlist.remove(temp);  
            
            temp=temp+k;
        }
        return arlist.get(0);
    }
}