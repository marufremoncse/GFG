package recursion;

public class FloodFillAlgorithm {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row = image.length;
        int col = image[0].length;
        int orgColor = image[sr][sc];
        floodFill(image, sr, sc, newColor, orgColor, row, col);
        return image;
    }

    public void floodFill(int[][] image, int sr, int sc, int newColor, int orgColor, int row, int col) {
        if(sr>=row || sc>=col || sc<0 || sr<0 || image[sr][sc]!=orgColor || image[sr][sc]==newColor){
            return;
        }
        image[sr][sc] = newColor;
        floodFill(image, sr+1, sc, newColor, orgColor, row, col);
        floodFill(image, sr-1, sc, newColor, orgColor, row, col);
        floodFill(image, sr, sc+1, newColor, orgColor, row, col);
        floodFill(image, sr, sc-1, newColor, orgColor, row, col);
    }
}
