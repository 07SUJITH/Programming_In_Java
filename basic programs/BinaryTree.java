import java.util.*;
public class BinaryTrees{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int indx=-1;
        public static Node buildTree(int nodes[]){
            indx++;
            if(nodes[indx]==-1)
                return null;
            Node newNode = new Node(nodes[indx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;

        }
    }
    public static void inorder(Node root){
        if(root==null)
            return ;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void preorder(Node root){
        if(root==null)
            return ;
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data +" ");
    }
    public static void levelorder(Node root){ 
        if(root==null)
            return;  
        Queue<Node> q =new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode =q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty())
                    break;
                else    
                    q.add(null);               
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                 q.add(currNode.right);
            }

        }

    }
    public static int countNodes(Node root){
        if(root==null)
            return 0;
        int leftNode=countNodes(root.left);
        int rightNode=countNodes(root.right);
        return leftNode+rightNode+1;
    }
    public static int  sumNodes(Node root){
        if(root==null) return 0;
        int leftSum=sumNodes(root.left);
        int rightSum=sumNodes(root.right);

        return leftSum + rightSum +root.data;
    }
    public static int height(Node root){//O(n)
        if(root==null)
            return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int myHeight=Math.max(leftHeight,rightHeight)+1;

        return myHeight;
    }
    // diameter of a tree = number of nodes in the longest path between any 2 nodes
    
     public static void main(String[] args) {
     int nodes[] ={ 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     BinaryTree tree = new BinaryTree();
     Node root =  tree.buildTree(nodes);
     System.out.println(root.data);
     preorder(root);//first root next left after right T=O(n)
     System.out.println();//left subtree root right subtree
     inorder(root);
     System.out.println();
     postorder(root);//left subtree right subtree root
     System.out.println();
     levelorder(root);
     System.out.println(countNodes(root));//O(n)
     System.out.println("sumofNode="+sumNodes(root));
     System.out.println("height=" + height(root));
    }
}
