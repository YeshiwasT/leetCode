class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] copy=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            copy[i]=nums[i];
        }
        Arrays.sort(copy);
        int first=0;
        for(int i=0;i<nums.length;i++){
            if(copy[i]!=nums[i]){
              first=i;
                break;
            }
        }
        int second=-1;
         for(int i=0;i<nums.length;i++){
            if(copy[i]!=nums[i]){
              second=i;
                
            }
        }
//         Stack<Integer> stack=new Stack<>();
//         ArrayList<Integer> list=new ArrayList<>();
//         ArrayList<Integer> list2=new ArrayList<>();
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             if(list2.size()>0&&list2.get(list2.size()-1)>nums[i]){
//                 list.add(i);
//                 list2.add(nums[i]);
//                 Collections.sort(list2);
// //                 while(!stack.isEmpty()&&stack.peek()>=nums[i]){
                    
// //                    // if(stack.peek()>nums[i]){
// //                        // stack.pop();4
                    
// //                         count++;
// //                     //}
// //                 }
//                 stack.push(nums[i]);
//             }
//             else{
//                 list2.add(nums[i]);
//                 stack.push(nums[i]);
//             }
//         }
//         if(list.size()>0){
//                  return list.get(list.size()-1)-list.get(0)+2;
   
//         }
//         return 0;
        return second-first+1;
    }
}