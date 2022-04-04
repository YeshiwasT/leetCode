public class Rotate_Array {
 
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] copy=new int[nums.length];
              

        int temp=k;
        int current=k;
        for(int i=0;i<nums.length;i++){
            if(temp<copy.length){
            copy[temp]=nums[i];}
            temp++;
        }
        for(int j=0;j<current;j++){
            if(k>=1){
                copy[j]=nums[nums.length-k];
                k--;}
            
        }
        for(int j=0;j<copy.length;j++){
            nums[j]=copy[j];
            
        }
       
}}