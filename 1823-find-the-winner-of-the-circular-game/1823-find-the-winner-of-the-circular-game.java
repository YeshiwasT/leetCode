class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> alist=new ArrayList<>();
        for(int i=0;i<n;i++){
            alist.add(i+1);
        }
        int temp=k;
        while(alist.size()>1){
            temp=(temp-1)%alist.size();
            alist.remove(temp);
            temp=temp+k;
        }
//         helper(alist);
//     }
//     public void helper(ArrayList<Integer> list){
//         if(list.size()==1){
//             return ;
//         }
        
        return alist.get(0);
    }
}