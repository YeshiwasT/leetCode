class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int[] prefixArr=new int[security.length];
       int[] suffixArr=new int[security.length];
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<prefixArr.length;i++){
            if(security[i]>security[i-1]){
                prefixArr[i]=0;
            }else{
            prefixArr[i]=prefixArr[i-1]+1;
        }}
        for(int i=security.length-2;i>=0;i--){
            if(security[i]>security[i+1]){
                suffixArr[i]=0;
            }else{
            suffixArr[i]=suffixArr[i+1]+1;
        }}
        for(int i=time;i<security.length-time;i++){
            if(prefixArr[i]>=time&&suffixArr[i]>=time){
                list.add(i);
            }
        }

return list;
    }
}