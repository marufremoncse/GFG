package arrays;

import java.util.ArrayList;

public class MaximumSubArray {
    ArrayList<Integer> findSubarray(int n, int a[]) {
        // code here
        ArrayList<Integer> currList = new ArrayList<>();
        ArrayList<Integer> maxList = new ArrayList<>();
        int currSum = 0;
        int maxSum = -1;

        for(int num:a){
            if(num>=0){
                currSum+=num;
                currList.add(num);
            } else{
                if(currSum>maxSum || currSum==maxSum && currList.size()>maxList.size()){
                    maxList = new ArrayList<>(currList);
                    maxSum = currSum;
                }
                currSum = 0;
                currList.clear();
            }
        }

        if(currSum>maxSum || currSum==maxSum && currList.size()>maxList.size()){
            maxList = new ArrayList<>(currList);
        }


        return maxList;
    }
}
