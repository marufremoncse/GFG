package arrays;

public class MinimumDistanceBetweenTwoNumbers {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int min = -1;
        int prev = -1;

        for(int i=0;i<n;i++){
            if(a[i]==x || a[i]==y){
                if(prev!=-1 && a[prev]!=a[i]){
                    if(min==-1 || i-prev<min){
                        min = i-prev;
                    }
                }
                prev = i;
            }
        }
        return min;
    }
}
