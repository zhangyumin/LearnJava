package algorithm.FindPath;

import java.util.ArrayList;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by joker on 16-9-4.
 */
public class FindPath {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    ArrayList<ArrayList<Integer>> al = new ArrayList<>();
    ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        result.add(root.val);
        target = target - root.val;
        if(target == 0 && root.left == null && root.right == null){
            al.add(new ArrayList<Integer>(result));
        }
        else{
            if (root.left != null) {
                FindPath(root.left, target);
            }
            if(root.right != null){
                FindPath(root.right, target);
            }
        }
        result.remove(result.size() - 1);
        return al;

    }


    public static void main(String[] args) {
        FindPath s = new FindPath();
        TreeNode root = s.new TreeNode(1);
        TreeNode rl1 = s.new TreeNode(2);
        TreeNode rr1 = s.new TreeNode(3);
        root.left = rl1;
        root.right = rr1;
        TreeNode rl2 = s.new TreeNode(4);
        TreeNode rr2 = s.new TreeNode(5);
        rl1.left = rl2;
        rl1.right = rr2;
        TreeNode rl3 = s.new TreeNode(6);
        TreeNode rr3 = s.new TreeNode(7);
        rr1.left = rl3;
        rr1.right = rr3;

        ArrayList<ArrayList<Integer>> al = s.FindPath(root, 8);
        System.out.println(al);
    }
}
