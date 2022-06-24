class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int temp=0;
        while(k>0){
             temp=pq.poll();
            k--;
        }
       return temp; 
        
    }
}