class Solution {
            List<List<Integer>> list=new LinkedList<>();
            Set<Integer> hash_Set = new HashSet<Integer>();
   public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> li=new LinkedList<>();
        helper(nums,li,nums.length,0);
        return list;
    }
    public void helper(int[] nums,LinkedList<Integer> li,int n,int i){
         if(li.size()==n){
            list.add(new LinkedList<>(li));
                return;}
         for(int j=0;j<nums.length;j++){
            if(hash_Set.contains(j)){
                continue;}
           hash_Set.add(j);
            li.add(nums[j]);
            helper(nums,li,n,j+1);
            li.remove(li.size()-1);
           hash_Set.remove(j);}
   
    }
}