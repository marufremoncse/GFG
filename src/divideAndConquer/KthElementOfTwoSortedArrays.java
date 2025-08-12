package divideAndConquer;

public class KthElementOfTwoSortedArrays {
    public int kthElement(int a[], int b[], int k) {
        int i=0, j=0, p=0;
        int temp[] = new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                temp[p++] = a[i++];
            } else {
                temp[p++] = b[j++];
            }
        }
        while(i<a.length){
            temp[p++] = a[i++];
        }

        while(j<b.length){
            temp[p++] = b[j++];
        }

        return temp[k-1];
    }
}
