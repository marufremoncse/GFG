package puzzles;

public class TriangularNumbers {
    int isTriangular(int N){
        //code here
        int sum = 0;
        int i = 1;
        while(sum+i<=N){
            sum+=i;
            i++;
        }

        return N==sum ? 1 : 0;
    }
}
