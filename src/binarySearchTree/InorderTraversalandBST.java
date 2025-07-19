package binarySearchTree;

public class InorderTraversalandBST {
    static int isRepresentingBST(int arr[], int N) {
        // code here
        int l = arr.length;
        for(int i=0;(2*i+2)<l;i++){
            if(arr[i]>arr[2*i+1] || arr[2*i+1]>arr[2*i+2]){
                return 0;
            }
        }

        return 1;
    }
}
