package binarySearchTree;

public class ArrayToBST {
    public Node sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length-1);
    }

    public Node sortedArrayToBST(int[] nums, int left, int right) {
        if(left>right){
            return null;
        }
        int mid = left + (right - left)/2;
        Node node = new Node(nums[mid]);
        node.left = sortedArrayToBST(nums, left, mid-1);
        node.right = sortedArrayToBST(nums, mid+1, right);
        return node;
    }
}
