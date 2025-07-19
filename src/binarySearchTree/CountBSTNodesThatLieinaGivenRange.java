package binarySearchTree;

public class CountBSTNodesThatLieinaGivenRange {
    int getCount(Node root, int l, int h) {
        // Your code here
        int[] count = new int[1];
        getCount(root, l, h, count);

        return count[0];
    }

    void getCount(Node root, int l, int h, int[] count){
        if(root==null){
            return;
        }
        if(root.data>=l && root.data<=h){
            count[0]++;
        }
        getCount(root.left, l, h, count);
        getCount(root.right, l, h, count);
    }
}
