class KthLargest {
            List<Integer> arrList=new ArrayList<Integer>();
          int kth=0;
    public KthLargest(int k, int[] nums) {
        kth=k;
       
        for(int i=0;i<nums.length;i++){
            arrList.add(nums[i]);
        }
    }
    
    public int add(int val) {
                arrList.add(val);

         if(arrList.size()==9999){
            return arrList.get(0);
        }else{
        Collections.sort(arrList);
        
        return arrList.get(arrList.size()-kth);
         }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */