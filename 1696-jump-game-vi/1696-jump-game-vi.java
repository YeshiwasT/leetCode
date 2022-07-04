class Solution {
    public int maxResult(int[] nums, int k) {
        int[] dp=new int[nums.length];
        Deque<Integer> deque=new LinkedList<>();
	dp[0]=nums[0];
        deque.add(0);
        for(int i=1;i<nums.length;i++){
            if(deque.peekFirst()<i-k)deque.pollFirst();
            dp[i]=nums[i]+dp[deque.peekFirst()];
            while(!deque.isEmpty()&&dp[deque.peekLast()]<=dp[i])
                deque.pollLast();
            deque.add(i);
        }
        return dp[nums.length-1];
    }
}
 