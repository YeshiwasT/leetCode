class Solution {
    public int hIndex(int[] citations) {
        
        int size=citations.length;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            if(citations[i]>=size){
                return size;
            }else{
                size--;
            }
        }
        
       return size; 
    }
}


