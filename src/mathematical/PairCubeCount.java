package mathematical;

public class PairCubeCount {
    static int pairCubeCount(int N) {
        // code here
        int count = 0;

        for(int i=1;i*i*i<=N;i++){
            for(int j=0;j*j*j<=N;j++){
                if(Math.pow(i,3) + Math.pow(j,3)==N){
                    count++;
                }
            }
        }

        return count;
    }
}
