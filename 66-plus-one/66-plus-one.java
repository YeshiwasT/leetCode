class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] ans=new int[digits.length+1];
        String str="";
        int count=1;
          //  int ans=digits[i]+1;

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
                    System.out.println(digits[i]);
                    
                    ans[i+1]=digits[i]+1;
                    digits[i]=digits[i]+1;
                    count=0;
                }else{
                                  ans[i+1]=digits[i];
  
                }
    
            }
         
        }
        if(count==1){
            ans[0]=1;
        }
                System.out.println(Arrays.toString(ans));
if(ans[0]==0){
    return digits;
}
       
        
        return ans;
    }
}