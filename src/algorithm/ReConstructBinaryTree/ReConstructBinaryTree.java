package algorithm.ReConstructBinaryTree;

import java.util.Arrays;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by joker on 16-8-29.
 */
public class ReConstructBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public ReConstructBinaryTree.TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if(pre.length == 0 || in.length == 0 || pre.length != in.length){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
//        if(pre.length == 1 && in.length == 1){
//            root.left = null;
//            root.right = null;
//            return root;
//        }
        int[] leftSubPre = new int[pre.length];
        int[] leftSubIn = new int[in.length];
        int[] rightSubPre = new int[pre.length];
        int[] rightSubIn = new int[in.length];
        int n = 0;
        while(in[n] != pre[0]){
            n ++;
        }
        leftSubIn = Arrays.copyOfRange(in, 0, n);
        rightSubIn = Arrays.copyOfRange(in, n + 1, pre.length);

        leftSubPre = Arrays.copyOfRange(pre, 1, leftSubIn.length + 1);
        rightSubPre = Arrays.copyOfRange(pre, leftSubIn.length + 1, pre.length);
        root.left = reConstructBinaryTree(leftSubPre, leftSubIn);
        root.right = reConstructBinaryTree(rightSubPre, rightSubIn);

        return root;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,3,5,6};
        int[] in = {4,2,1,5,3,6};
        ReConstructBinaryTree test = new ReConstructBinaryTree();
        TreeNode root = test.reConstructBinaryTree(pre,in);
        System.out.println(root);
    }
}
