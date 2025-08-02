package arrays;

public class StockBuyAndSell {
    int stockBuySell(int arr[]) {
        int l = arr.length;
        int currMax = arr[l-1];
        int currMin = arr[l-1];
        int sum = 0;

        int j = l-1;

        while(j>=0){
            if(arr[j]<currMin){
                currMin = arr[j];
            } else{
                sum+=currMax - currMin;
                currMax = arr[j];
                currMin = arr[j];
            }
            j--;
        }
        sum+=currMax - currMin;
        return sum;
    }
}
