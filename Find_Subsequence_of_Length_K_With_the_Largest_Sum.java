import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Find_Subsequence_of_Length_K_With_the_Largest_Sum {
  
    public int[] maxSubsequence(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        PriorityQueue<int[]> pq=new PriorityQueue<int[]>((a,b)->b[0]-a[0] );
                PriorityQueue<int[]> q=new PriorityQueue<int[]>((a,b)->a[1]-b[1] );

        int[] result=new int[k];
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
        }

        int j=0;
        while(j<k){
            
        System.out.println(pq.peek()[0]);
            q.add(new int[]{pq.peek()[0],pq.poll()[1]});
        j++;
        }

    int z=0;
        while( z<k){
            result[z]=q.poll()[0];
            z++;
        }
        System.out.println(Arrays.toString(result));
        
        
    return result;
    }
}