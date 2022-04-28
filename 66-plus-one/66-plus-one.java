class Solution {
    public int[] plusOne(int[] digits) {
        int[] ans=new int[digits.length+1];
       int count=1;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                if(count==1){
                ans[i+1]=0;
                digits[i]=0;
                count=1; 
                }else{
                    ans[i+1]=digits[i];
                }
               
            }else{
                if(count==1){
                    ans[i+1]=digits[i]+1;
                    digits[i]=digits[i]+1;
                    count=0;
                }else{
                    ans[i+1]=digits[i];
   } } }
        if(count==1){
            ans[0]=1; }
if(ans[0]==0){
    return digits;
}
        return ans;
    }
}