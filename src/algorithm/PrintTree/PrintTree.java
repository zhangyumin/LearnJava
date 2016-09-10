package algorithm.PrintTree;

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
 * Created by joker on 16-9-4.
 */
public class PrintTree {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        int nextlevel = 0;
        int tobeprint = 1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        LinkedList<TreeNode> ll = new LinkedList();
        if(pRoot == null){
            return result;
        }
        ll.push(pRoot);
        while(!ll.isEmpty()){
            if(ll.peek().left != null){
                ll.add(ll.peek().left);
                nextlevel ++;
            }
            if(ll.peek().right != null){
                ll.add(ll.peek().right);
                nextlevel ++;
            }
            tmp.add(ll.pop().val);
            tobeprint --;
            if(tobeprint == 0){
                result.add(new ArrayList<Integer>(tmp));
                tmp.clear();
                tobeprint = nextlevel;
                nextlevel = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        PrintTree s = new PrintTree();
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

        System.out.println(s.Print(root));
    }

}
