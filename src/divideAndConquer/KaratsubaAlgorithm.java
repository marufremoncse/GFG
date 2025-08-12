package divideAndConquer;

public class KaratsubaAlgorithm {
    static Long karatsubaAlgo(String A, String B) {
        long a = 0L;
        long b = 0L;
        int l_a = A.length();
        int l_b = B.length();

        int p = 0;
        for(int i=l_a-1;i>=0;i--){
            if(A.charAt(i)=='1'){
                a += Math.pow(2, p);
            }
            p++;
        }

        p = 0;
        for(int j=l_b-1;j>=0;j--){
            if(B.charAt(j)=='1'){
                b += Math.pow(2, p);
            }
            p++;
        }

        return a*b;
    }
}
