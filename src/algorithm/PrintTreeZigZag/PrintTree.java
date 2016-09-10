package algorithm.PrintTreeZigZag;

import java.util.ArrayList;
import java.util.Collections;
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
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        LinkedList<TreeNode> node = new LinkedList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(pRoot == null){
            return result;
        }
        int tobeprint = 1;
        int nextline = 0;
        node.add(pRoot);
        while(!node.isEmpty()){
            tobeprint --;
            if(node.peek().left != null){
                node.add(node.peek().left);
                nextline ++;
            }
            if(node.peek().right != null){
                node.add(node.peek().right);
                nextline ++;
            }
            tmp.add(node.pop().val);
            if(tobeprint == 0){
                tobeprint = nextline;
                nextline = 0;
                result.add(new ArrayList<>(tmp));
                tmp.clear();
            }
        }
        for (int i = 0; i < result.size(); i++) {
            if(i % 2 == 1){
                Collections.reverse(result.get(i));
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
