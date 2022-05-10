class Solution {
     List<List<Integer>> listOfList= new LinkedList<List<Integer>>();
    ArrayList<Integer> list=new  ArrayList<Integer>();
   // HashMap<Integer,Integer> map=new HashMap<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
       
        int[] arr=new int[9];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
            
        }
        combinationSum(listOfList,arr,0,list,n,k,n);
        System.out.println();
       System.out.println(Arrays.toString(arr));
        return listOfList;
    }
    public void combinationSum(List<List<Integer>> listOfList,int[] arr,int start,ArrayList<Integer> list,int len,int k,int total){
        if(k==0&&total==0){
                        for(int j=0;j<list.size();j++){
                        System.out.print(list.get(j));
    
            }
                    
       listOfList.add(new LinkedList<Integer>(list));
            return;
        }
        for (int i=start;i<arr.length&&k>0&&total>0;i++){
               
                    list.add(arr[i]);
//total+=arr[i]; 
                                 //   System.out.println();

             combinationSum(listOfList,arr,i+1,list,len,k-1,total-arr[i]);
        list.remove(list.size()-1);
  
                }
            }
      
}