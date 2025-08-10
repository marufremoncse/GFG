package mathematical;

public class ClosestNumber {
    static int closestNumber(int n, int m) {
        int closest1 = 0;
        int closest2 = 0;
        int res = 0;
        int i = 0;
        while(true){
            if((n-i)%m==0){
                closest1 = n-i;
            }
            if((n+i)%m==0){
                closest2 = n+i;
            }
            if((n-i)%m==0 || (n+i)%m==0){
                res = Math.abs(closest1)> Math.abs(closest2) ? closest1 : closest2;
                break;
            }
            i++;
        }

        return res;
    }
}
