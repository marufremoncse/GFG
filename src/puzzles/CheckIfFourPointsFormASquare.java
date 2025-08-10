package puzzles;

import java.util.Arrays;

public class CheckIfFourPointsFormASquare {
    public String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4,
                           int y4) {
        int[] d = new int[6];
        d[0] = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        d[1] = (x1-x3)*(x1-x3)+(y1-y3)*(y1-y3);
        d[2] = (x1-x4)*(x1-x4)+(y1-y4)*(y1-y4);
        d[3] = (x2-x3)*(x2-x3)+(y2-y3)*(y2-y3);
        d[4] = (x2-x4)*(x2-x4)+(y2-y4)*(y2-y4);
        d[5] = (x3-x4)*(x3-x4)+(y3-y4)*(y3-y4);

        Arrays.sort(d);

        if(d[0]==0) return "No";

        return (d[0]==d[1] && d[1]==d[2] && d[2]==d[3] && d[4]==d[5] && d[4] == 2 * d[0]) ? "Yes" : "No";
    }
}
