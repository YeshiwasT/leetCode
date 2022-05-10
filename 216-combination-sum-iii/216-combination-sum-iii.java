class Solution {
   
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>> listOfList= new LinkedList<List<Integer>>();
    ArrayList<Integer> list=new  ArrayList<Integer>();
        int[] arr=new int[9];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;}
        combinationSum(listOfList,arr,0,list,k,n);
        return listOfList;
    }
    public void combinationSum(List<List<Integer>> listOfList,int[] arr,int start,ArrayList<Integer> list,int k,int total){
        if(k==0&&total==0){              
       listOfList.add(new LinkedList<Integer>(list));
            return;
        }
        for (int i=start;i<arr.length&&k>0;i++){
              list.add(arr[i]);
              combinationSum(listOfList,arr,i+1,list,k-1,total-arr[i]);
              list.remove(list.size()-1);
  
                }
            }
      
}