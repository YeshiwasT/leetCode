public class Single_number {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        int notRepeted=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                
map.put(nums[i],2);                
            }else{
            map.put(nums[i],1);}
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                notRepeted=nums[i];
            }
        }
        return notRepeted;
    }
}
    

