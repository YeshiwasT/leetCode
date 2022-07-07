class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count=0;
        int ans=0;
        LinkedList<Integer> list=new LinkedList<>();
        int end=0;
        list.add(-1);
        // for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
               if(nums[j]%2==1){
                   list.add(j);
               } 
                if(list.size()>k+1){
                  list.pop();
                }
             
               if(list.size()==k+1){
             ans=ans+(list.size()>1?list.get(1):j)-list.get(0);
  
               }}
        return ans;
    }
}