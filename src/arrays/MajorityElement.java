package arrays;

public class MajorityElement {
    static int majorityElement(int arr[]) {
        // your code here
        int candidate = -1;
        int count = 0;

        for(int num: arr){
            if(count==0){
                candidate = num;
                count++;
            } else if(candidate!=num){
                count--;
            } else{
                count++;
            }
        }
        count = 0;
        for(int num:arr){
            if(num==candidate){
                count++;
            }
        }

        return count>arr.length/2 ?  candidate : -1;
    }
}
