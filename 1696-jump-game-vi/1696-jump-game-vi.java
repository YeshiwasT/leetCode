class Solution {
    public int maxResult(int[] nums, int k) {
       
        Deque<Integer> queue=new LinkedList<>();
        int[] dp=new int[nums.length];
        queue.add(0);
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
           if(queue.peekFirst()<i-k)queue.pollFirst();
            dp[i]=nums[i]+dp[queue.peekFirst()];
            while(!queue.isEmpty()&&dp[queue.peekLast()]<=dp[i]){
                queue.pollLast();
            }
            queue.add(i);
        }
        return dp[dp.length-1];
        /*
        1 0 -1 3 -4 7
        5
        */
    }
}