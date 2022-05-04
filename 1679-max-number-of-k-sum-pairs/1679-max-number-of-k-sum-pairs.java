class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int maxOp=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            int temp=k-nums[i];
            if(map.containsKey(temp)){
                int j=i+1;
                while(j<nums.length){
                    if(temp==nums[j]){
                    nums[j]=0;
                         maxOp++;

                        break;
                    
                    }
                j++;}
                nums[i]=0;

                
            }
        }
      return maxOp;  
    }
}