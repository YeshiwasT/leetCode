class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
            int ans=0;
        int width=height.length-1;
        while(width>0){
            int area=Math.min(height[start],height[end])*width;
            ans=Math.max(ans,area);
            if(height[start]<=height[end]){
                start++;
            }
            else{
                end--;
            }
            width--;
        }
        return ans;
    }
}