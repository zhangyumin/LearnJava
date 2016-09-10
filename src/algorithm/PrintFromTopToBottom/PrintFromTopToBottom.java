package algorithm.PrintFromTopToBottom;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by joker on 16-9-3.
 */
public class PrintFromTopToBottom {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        LinkedList<TreeNode> ll = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        ll.add(root);
        while(!ll.isEmpty()){
            TreeNode current = ll.pop();
            if(current.left != null){
                ll.add(current.left);
            }
            if(current.right != null){
                ll.add(current.right);
            }
            result.add(current.val);
        }
        return result;
    }

    public static void main(String[] args) {
        PrintFromTopToBottom s = new PrintFromTopToBottom();
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
        System.out.println(s.PrintFromTopToBottom(root));
    }
}
