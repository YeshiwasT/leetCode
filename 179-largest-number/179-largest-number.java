class Solution {
    public String largestNumber(int[] nums) {
       String[] sArr=new String[nums.length];
        for(int i=0;i<sArr.length;i++){
            sArr[i]=Integer.toString(nums[i]);
        }
       Arrays.sort(sArr,(a,b)->(b+a).compareTo(a+b));
        if(sArr[0].charAt(0)=='0'){
            return "0";
        }
        String str="";
        for(int i=0;i<sArr.length;i++){
            str=str+sArr[i];
        }
        
        return str;
    }
}