class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] mix=new int[position.length][2];
        int count=0;
        for(int i=0;i<mix.length;i++){
            mix[i][0]=target-position[i];
            mix[i][1]=speed[i];
        }
        Arrays.sort(mix,(int[] arr1,int[] arr2)->(arr1[0]-arr2[0])
        );
        double time=0;
        for(int i=0;i<mix.length;i++){
          double ans=(double)mix[i][0]/(double)mix[i][1];

            if(time<ans){
                count++;
                time=ans;
            }
        }
    
        return count;
    }
}