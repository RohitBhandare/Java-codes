
public class BST
{
    int level=0;
    class Node
    {
        int data;
        Node left;
        Node right;
        Node(int val)
        {
            data=val;
            this.left=null;
            this.right=null;
        }
    }
    public Node insert(Node root,int data)
    {
        if(root==null)
            return new Node(data);
        if(data<root.data)
            root.left=insert(root.left,data);
        else if(data>root.data)
            root.right=insert(root.right,data);
        return root;
    }
    public void preorder(Node root)
    {
        if(root==null)
            return;
        else
        {
            System.out.print(" "+root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void Inorder(Node root)
    {
        if(root==null)
            return;
        else
        {
            Inorder(root.left);
            System.out.print(" "+root.data);
            Inorder(root.right);
        }
    }
    public void search(Node root,int key)
    {
        if(root!=null) {
            if (key == root.data) {
                System.out.println("\nkey found: " + root.data+ " At level "+level);
            } else if (key > root.data) {
                 level=level + 1;
                search(root.right, key);
            } else if (key < root.data) {
                level=level + 1;
                search(root.left, key);
            }
        }
        else
            System.out.println("\nElement not found");

    }
    public static void main(String[] args)
    {
        System.out.println("**************** BST *******************");
        Node root=null;
        BST obj=new BST();
        root=obj.insert(root,30);
        obj.insert(root,20);
        obj.insert(root,40);
        obj.insert(root,15);
        obj.insert(root,25);
        obj.insert(root,35);
        System.out.print("Preorder: ");
        obj.preorder(root);
        System.out.print("\nInorder: ");
        obj.Inorder(root);
        obj.search(root,25);
    }
}
/* ***************************** OUTPUT *********************
**************** BST *******************
Preorder:  30 20 15 25 40 35
Inorder:  15 20 25 30 35 40
Process finished with exit code 0
****************************************************************** */