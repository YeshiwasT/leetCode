class Solution {
    public String largestNumber(int[] nums) {
       String[] sArr=new String[nums.length];
        for(int i=0;i<sArr.length;i++){
            sArr[i]=Integer.toString(nums[i]);
        }
       Arrays.sort(sArr,(a,b)->(b+a).compareTo(a+b));
              //  Arrays.sort(sArr);
       System.out.println( Arrays.toString(sArr));
        if(sArr[0].charAt(0)=='0'){
            return "0";
        }
               StringBuilder str=new StringBuilder();
        String std="";
        for(int i=0;i<sArr.length;i++){
            std=std+sArr[i];
        }
        
        return std;
    }
}