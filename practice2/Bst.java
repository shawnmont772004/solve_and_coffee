package practice2;

import java.util.Scanner;

class Node{
    int key;
    Node left, right;
    public Node(int key){
        this.key=key;
        left=right=null;
    }
}

public class Bst{

    Node root;

    public void insert(int key){
        root=insertRec(root,key);
    }

    public Node insertRec(Node root, int key){
        if(root==null){
            Node newNode=new Node(key);
            root=newNode;
            return root;
        }
        else{
            if(key<root.key){
                root.left=insertRec(root.left,key);
            }
            else{
                root.right=insertRec(root.right,key);
            }
        }
        return root;
    }

    public void deleteKey(int key){
        root=deleteRec(root,key);
    }
    public Node deleteRec(Node root, int key){
        if(root==null){
            return null;
        }
        if(root.key==key){
            if(root.left==null){
                 return root.right; 
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                int min= minElem(root.right);
                root.key=min;
                root.right=deleteRec(root.right,min);
            }
            }
            else{
                if(key<root.key){
                    root.left=deleteRec(root.left,key);
                }
                else{
                    root.right=deleteRec(root.right,key);
                }
            }
        
        return root;
    }

    public int minElem(Node root){
        int min=root.key;
        while(root!=null){
            min=root.key;
            root=root.left;
        }
        return min;
    }

    public void inorder(){
         inorderRec(root);
    }

    public void inorderRec(Node root){
        if (root != null) { // Base case
            inorderRec(root.left);
            System.out.print(root.key+" ");
            inorderRec(root.right);
        }
    }

    public void preorder(){
         preorderRec(root);
    }

    public void preorderRec(Node root){
        if (root != null) { // Base case
            System.out.print(root.key+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
       
    }

    public void postorder(){
        postorderRec(root);
    }

    public void postorderRec(Node root){
        if (root != null) { // Base case
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key+" ");
        }
        
    }

   

    public void search(int key){
        boolean status=searchRec(root,key);
        if(status==true){
            System.out.println("Element is found");
        }
        else{
            System.out.println("Element is not found");
        }
    }

    public boolean searchRec(Node root,int key){
        // if(root.key==key){
            
        // }
        // else{
        //     if(key<root.key){
        //         root.left=searchRec(root.left,key);
        //     }
        //     else{
        //         root.right=searchRec(rppt.right,key);
        //     }
        // }
        while(root!=null){
            if(root.key==key){
                return true;            
            }
            else if(key<root.key){
                root=root.left;
            }
            else{
                root=root.right;
            }
        }
        return false;

    }



    public static void main(String args[]){
        Bst bst=new Bst();
        Scanner scanner = new Scanner(System.in);
        int choice, key;

        while (true) {
            System.out.println("\nBinary Search Tree Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. In-order Traversal");
            System.out.println("5. Pre-order Traversal");
            System.out.println("6. Post-order Traversal");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key to insert: ");
                    key = scanner.nextInt();
                    bst.insert(key);
                    break;
                case 2:
                    System.out.print("Enter key to delete: ");
                    key = scanner.nextInt();
                    bst.deleteKey(key);
                    break;
                case 3:
                    System.out.print("Enter key to search: ");
                    key = scanner.nextInt();
                    bst.search(key);
                    //if (bst.search(key))
                    //    System.out.println("Key found in the tree.");
                    //else
                    //    System.out.println("Key not found in the tree.");
                    break;
                case 4:
                    System.out.println("In-order traversal:");
                    bst.inorder();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Pre-order traversal:");
                    bst.preorder();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Post-order traversal:");
                    bst.postorder();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}