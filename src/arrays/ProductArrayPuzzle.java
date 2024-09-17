package arrays;

public class ProductArrayPuzzle {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        long allProd = 1;
        int countZeros = 0;

        for(int num: nums){
            if(num==0){
                countZeros++;
            } else{
                allProd*=num;
            }
        }

        long[] res = new long[nums.length];

        for(int i=0;i<nums.length;i++){

            if(countZeros>1){
                res[i] = 0;
            } else{
                if(nums[i]==0){
                    if(countZeros==1){
                        res[i] = allProd;
                    }
                } else{
                    if(countZeros==1){
                        res[i] = 0;
                    } else{
                        res[i] = allProd/nums[i];
                    }
                }
            }
        }

        return res;
    }
}
