package puzzles;

public class CheckforPower {
    static Long isPowerOfAnother(Long X, Long Y){
        // code here
        if(X==1){
            return Y==1 ? (long)1 : (long)0;
        }

        while(Y%X==0){
            Y/=X;
        }

        return Y==1 ? (long)1 : (long)0;
    }
}
