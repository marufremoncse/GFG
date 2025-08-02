package arrays;

public class TrappingRainWater {
    public int maxWater(int arr[]) {
        int sum = 0;
        int left = 0, right = arr.length-1;
        int maxLeftHeight = arr[0], maxRightHeight = arr[arr.length-1];
        while(left<right){
            if(arr[left]<arr[right]){
                if(maxLeftHeight<arr[left]){
                    maxLeftHeight = arr[left];
                } else{
                    sum+=maxLeftHeight-arr[left];
                }
                left++;
            } else{
                if(maxRightHeight<arr[right]){
                    maxRightHeight = arr[right];
                } else{
                    sum+=maxRightHeight-arr[right];
                }
                right--;
            }
        }

        return sum;
    }
}
