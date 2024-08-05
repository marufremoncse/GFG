package sorting;

public class SortAnArrayof0s1sAnd2s {
    public static void sort012(int a[], int n)
    {
        // code here
        int zero = 0, one = 0, two = 0;

        for(int num:a){
            if(num==0)
                zero++;
            else if(num==1)
                one++;
            else if(num==2)
                two++;
        }

        int i=0;
        while(zero>0){
            a[i++] = 0;
            zero--;
        }

        while(one>0){
            a[i++] = 1;
            one--;
        }

        while(two>0){
            a[i++] = 2;
            two--;
        }
    }
}
