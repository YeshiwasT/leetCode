class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> alist=new ArrayList<>();
        for(int i=0;i<n;i++){
            alist.add(i+1);
        }
        int temp=k;
        // while(alist.size()>1){
        //     temp=(temp-1)%alist.size();
        //     alist.remove(temp);
        //     temp=temp+k;
        // }
     return  helper(alist,temp,k);
    }
    public int helper(ArrayList<Integer> list,int temp,int k){
        if(list.size()==1){
            return list.get(0);
        }
        temp=(temp-1)%list.size();
        list.remove(temp);
            temp=temp+k;

     return   helper(list,temp,k);
     
        
    }
}