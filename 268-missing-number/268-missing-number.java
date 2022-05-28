class Solution {
    public int missingNumber(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<=nums.length;i++){
            map.put(i,1);
        }
        for(int i=0;i<nums.length;i++){
         if(map.containsKey(nums[i])){
             map.replace(nums[i],0);
         }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
             if( entry.getValue()==1){
                     return entry.getKey();
                    }
        } 
             
     return 2;   
    }
}