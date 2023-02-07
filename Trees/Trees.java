import java.util.*;

public class Trees {
    static Node root;
    static Scanner sc;
    
    public static void main(String args[]) {
        sc = new Scanner(System.in);
        Node root=createTree();
        inOrder(root);
        System.out.println();
    }

    public static Node createTree() {
        Node root = null;
        System.out.println("Enter the  value");
        int data = sc.nextInt();
        if(data==-1)
        return null;
        root = new Node(data);
        System.out.print("Enter the value for left node of"+data);
        root.left = createTree();
        System.out.print("Enter the value for the right node"+data);
        root.right = createTree();
        return root;
    }
    static void inOrder(Node root)
    {
        if(root==null)
        return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    static void preOrder(Node root)
    {
        if(root==null)
        return ;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }
    static void topView(Node root)
    {

    }
    static void bottomView(Node root)
    {
        
    }
}
class Node {
            Node left;
            Node right;
            int data;
            Node(int data) {
                this.data = data;
            }
    }

