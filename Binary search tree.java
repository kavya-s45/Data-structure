import java.util.*; 
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int d){
        data=d;
        left=null;
        right=null;
    }
}
class BinarysearchTree{
    TreeNode root=null;
    void insert(int d){
        root=insert(root,d);
    }
    TreeNode insert(TreeNode curr,int d){
        if(curr==null){
            TreeNode node=new TreeNode(d);
            return node;
        }
        if(curr.data>d){
            curr.left=insert(curr.left,d);
        }
        else{
            curr.right=insert(curr.right,d);
        }
        return curr;
    }
    boolean search(int key){
        return search(key,root);
    }
    boolean search(int key, TreeNode curr){
        if(curr==null){
            return false;
        }
        
        else if(key==curr.data){
            System.out.println(curr.data + " ->");
           return true; 
        }
        else if(key<curr.data){
            System.out.println(curr.data + " ->");
            return search(key,curr.left);
        }
        else{
             System.out.println(curr.data + " ->");
            return search(key,curr.right);
        }
    }
    void level_order(){
        Queue<TreeNode>que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            TreeNode curr=que.remove();
            System.out.print(curr.data + " ");
            if(curr.left!=null){
                que.offer(curr.left);
            }
            if(curr.right!=null){
                que.offer(curr.right);
            }
        }
    }

    void  pre_order(){
        pre_order(root);
        System.out.println();
    }
    void pre_order(TreeNode curr){
        if(curr==null){
            return ;
        }
        System.out.print(curr.data + " ");
        pre_order(curr.left);
        pre_order(curr.right);
    }
    
    void  post_order(){
        post_order(root);
        System.out.println();
    }
    void post_order(TreeNode curr){
        if(curr==null){
            return ;
        }
       
        post_order(curr.left);
        post_order(curr.right);
         System.out.print(curr.data + " ");
    }
}

public class Main
{
	public static void main(String[] args) {
		BinarysearchTree bst=new BinarysearchTree();
		bst.insert(40);
		bst.insert(20);
		bst.insert(60);
		bst.insert(10);
		bst.insert(30);
		bst.pre_order();
		bst.post_order();
		System.out.println(bst.search(90));
		bst.level_order();
	
	}
}




//output

40 20 10 30 60 
10 30 20 60 40 
40 ->
60 ->
false
40 20 60 10 30 