public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int currMax,max=0;
        while(i<j){
            currMax=(j-i)*(Math.min(height[i],height[j]));
            max=max<currMax?currMax:max;
            if(height[i]<height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}

