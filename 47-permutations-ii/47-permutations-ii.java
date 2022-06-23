class Solution {
    List<List<Integer>> result= new ArrayList<>();
       HashMap<Integer,Integer> map=new HashMap<>();
             Set<Integer> hash_Set = new HashSet<Integer>();
         int[] arr;
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list=new ArrayList<>();
     arr=nums;
       System.out.println(Arrays.toString(arr));
        helper(list,nums.length);
        return result;
    }
    public void helper(List<Integer> list,int len){
        if(list.size()==len){
            List<Integer> l=new ArrayList<>(list);
            if(!result.contains(l)){
             
                         result.add(l);
  
            }
        }
        for(int i=0;i<arr.length;i++){
            if(hash_Set.contains(i)){
                continue;
            }
           
                 hash_Set.add(i);
                list.add(arr[i]);
                helper(list,len);
               list.remove(list.size()-1);
                hash_Set.remove(i);
            }
        }
        
       
    
} 