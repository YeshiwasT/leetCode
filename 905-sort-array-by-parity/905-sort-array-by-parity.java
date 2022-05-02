class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
           for(int i=0;i<nums.length;i++){
               if(nums[i]%2==0){
                 list1.add(nums[i]);}
               else{
                   
                 list2.add(nums[i]);}
           }
        for(int i=0;i<list1.size();i++){

            nums[i]=list1.get(i);}
        int j=0;
        for(int i=list1.size();i<nums.length;i++){
            nums[i]=list2.get(j);
            j++;
        }
            return nums;
    }
}