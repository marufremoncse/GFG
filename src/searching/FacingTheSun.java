package searching;

public class FacingTheSun {
    public int countBuildings(int[] height) {
        int count = 1;
        int currentMaxHeight = height[0];
        int l = height.length;

        for(int i=1;i<l;i++){
            if(height[i]>currentMaxHeight){
                count++;
                currentMaxHeight = height[i];
            }
        }
        return count;
    }
}
