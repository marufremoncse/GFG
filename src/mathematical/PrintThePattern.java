package mathematical;

public class PrintThePattern {
    public static void printPat(int n) {
        // Your code here
        int count = 0, p = 0;
        for(int i=n;i>0;i--){
            p = n;
            for(int j=0;j<i*n;j++){
                System.out.print(p+" ");
                if(++count==i){
                    count = 0;
                    p--;
                }
            }
            System.out.print("$");
        }
    }

    public static void main(String[] args) {
        printPat(3);
    }
}
