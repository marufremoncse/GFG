package arrays;

public class FindMissingAndRepeating {
    int[] findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        int count[] = new int[n+1];
        int res[] = new int[2];

        for(int num: arr){
            count[num]++;
        }

        for(int i=1;i<=n;i++){
            if(count[i]==0){
                res[1] = i;
            } else if(count[i]==2){
                res[0] = i;
            }
        }

        return res;
    }
}
