package stack;

public class ImmediateSmallerElement {
    public void immediateSmaller(int arr[]) {
        int l = arr.length;
        for(int i=0;i<l-1;i++){
            if(arr[i]>arr[i+1]){
                arr[i] = arr[i+1];
            } else{
                arr[i] = -1;
            }
        }

        arr[l-1] = -1;
    }
}
