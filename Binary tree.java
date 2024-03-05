import java.util.Scanner;

class treeNode {
    int data;
    treeNode left; // Address of left child
    treeNode right; // Address of right child
    public treeNode(int d) {
        data = d;
        left = null;
        right = null;
    }
}

class BinaryTree {
    treeNode root = null;
    void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root val : ");
        int val = sc.nextInt(); 
        if(val != -1){
            treeNode node = new treeNode(val); // root node
            root = node;
            insert(root);
        }
    }
    void insert(treeNode curr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the left val of " + curr.data + " : ");
        int left_val = sc.nextInt();
        if(left_val!=-1){
            treeNode node = new treeNode(left_val);
            curr.left = node;
            insert(curr.left);
        }
        System.out.println("Enter the right val of " + curr.data + " : ");
        int right_val = sc.nextInt();
        if(right_val!=-1){
            treeNode node = new treeNode(right_val);
            curr.right = node;
            insert(curr.right);
        }
    }

    void pre_order(){
        pre_order(root);
    }
    void pre_order(treeNode curr){
        if (curr == null){
            return;
        }
        System.out.print(curr.data + " ");
        pre_order(curr.left);
        pre_order(curr.right);
    }
    void in_order(){
        in_order(root);
    }
    void in_order(treeNode curr){
        if (curr == null){
            return;
        }
        in_order(curr.left);
        System.out.print(curr.data + " ");
        in_order(curr.right);
    }
    void post_order(){
        post_order(root);
    }
    void post_order(treeNode curr){
        if (curr == null){
            return;
        }
        post_order(curr.left);
        post_order(curr.right);
        System.out.print(curr.data + " ");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        BinaryTree bt = new BinaryTree();
        bt.insert();
        bt.pre_order();
    }
}
