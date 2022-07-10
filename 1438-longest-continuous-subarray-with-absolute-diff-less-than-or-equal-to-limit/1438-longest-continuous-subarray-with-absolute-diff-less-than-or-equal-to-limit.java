class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max=new LinkedList<>();
        Deque<Integer> min=new LinkedList<>();
        int start=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            while(!max.isEmpty()&&max.peekLast()<nums[i]){
                max.pollLast();
            }
            max.addLast(nums[i]);
            while(!min.isEmpty()&&min.peekLast()>nums[i]){
                min.pollLast();
            }
            min.addLast(nums[i]);
            while(max.peekFirst()-min.peekFirst()>limit){
                if(max.peekFirst()==nums[start])max.pollFirst();
                if(min.peekFirst()==nums[start])min.pollFirst();
                start++;
            }
            count=Math.max(count,i-start+1);
            
        }
        return count;
    }
}