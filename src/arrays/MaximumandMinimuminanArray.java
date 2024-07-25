package arrays;

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class MaximumandMinimuminanArray {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int l = arr.length;
        for(int i=0;i<l;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        return new Pair(min,max);
    }
}
