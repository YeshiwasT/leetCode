public class Max_Consecutive_Ones_III {

    public int longestOnes(int[] nums, int k) {
        int result=0;
        int startPointer=0;
        int[] zeros=new int[nums.length];
        int temp=k;
        int z=0;
        int firstZeroPointer=0;
       
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
               result=Math.max(result,i-startPointer+1); 
                
            }
            else{
                zeros[firstZeroPointer]=i;
                if(temp>0){
                temp--;
                    
                
            }else{ 
                    startPointer=zeros[z]+1;
                    z++;

                }
                                result=Math.max(result,i-startPointer+1); 

                                firstZeroPointer++;
        }
        }
       return result; 
    }
}