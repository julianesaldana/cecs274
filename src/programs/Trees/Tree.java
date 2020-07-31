package programs.Trees;

public class Tree {
    // setting up tree nodes
    public static class treeNode {
        private int value;
        private treeNode lowerChild;  // recursively defined object   // recursion
        private treeNode upperChild;

        public treeNode (int x){
            value = x;
            lowerChild = null;
            upperChild = null;
        }

        public int getValue(){
            return value;
        }
    }
    // end of treeNode setup


    // setting up actual binary tree
    private treeNode root;      // list is going to use a head and utilize "next" of nodes

    public Tree() {       // constructor
        root = null;
    }

    // setting up tree functions
    public int getRootValue(){
        return root.getValue();
    }

    public void add(int x){ // adding x to the bst
        if (root == null){
            root = new treeNode(x);
            System.out.println("New Root: " + x);
        }
        else{
            System.out.println("Adding: " + x);
            add(root, x);
        }
    }

    private void add(treeNode parent, int x){   // recursively adding to subtrees
        if (x == parent.getValue())
            System.out.printf("Duplicate value %d will not be added\n", x);
        else
            if (x < parent.getValue()){
                if (parent.lowerChild == null)
                    parent.lowerChild = new treeNode(x);
                else
                    add(parent.lowerChild, x);
            } else {
                if (parent.upperChild == null)
                    parent.upperChild = new treeNode(x);
                else
                    add(parent.upperChild, x);
            }
    }

    public int size(){      // this function will tell us the size of the entire tree, no parameters
        if (root == null)   // technically this function is not recursive because it called the private function twice
            return 0;
        else
            return 1 + size(root.lowerChild) + size(root.upperChild);  // this function will tell us the size of each subtree, with parameter for nodes
    }

    private int size(treeNode parent){  // size of the subtree
        if (parent == null)  // this function is actually recursive
            return 0;
        else
            return 1 + size(parent.lowerChild) + size(parent.upperChild);
    }

    public int sum(){   // sum of tree, this will be used to calculate average alongside size
        if (root == null)
            return 0;
        else
            return root.getValue() + sum(root.lowerChild) + sum(root.upperChild);
    }

    private int sum(treeNode parent){   // sum of subtrees
        if (parent == null)
            return 0;
        else
            return parent.getValue() + sum(parent.lowerChild) + sum(parent.upperChild);
    }

    public void display(){ // in-order: left child, parent, right child
        if (root == null)
            System.out.println("Tree is empty");
        else
            display(root);
    }

    private void display(treeNode parent){
        if (parent == null)
            return;
        else {
            display(parent.lowerChild);     // goes through the smallest to largest
            System.out.print(parent.getValue() + ", ");
            display(parent.upperChild);
        }
    }

    public int height(){
        if (root == null)
            return 0;
        else
            return 1 + Math.max(height(root.lowerChild), height(root.upperChild));  // adds the root and the max of the two subtree heights
    }

    private int height(treeNode parent){
        if (parent == null)
            return 0;       // stops if tree gets to the end
        else
            return 1 + Math.max(height(parent.lowerChild), height(parent.upperChild));  // traverses through subtrees and finds height, chooses max between the lower and upper childs
    }

    public int min(){   // big tree
        if (root == null)
            return 0;
        else
            return min(root);
    }

    private int min(treeNode parent){   // traverses to the very bottom left which is smallest value in subtrees
        int min = parent.getValue();
        if (parent.lowerChild == null)  // stops when it gets to the end i.e. when there is no longer any lower child
            return min;
        else
            return min(parent.lowerChild);  // keeps going if the next parent has a lower child
    }

    public int max(){
        if (root == null)
            return 0;
        else
            return max(root);
    }

    private int max(treeNode parent){   // traverses to the very bottom right which is highest value in subtrees
        int max = parent.getValue();
        if (parent.upperChild == null)  // stops when it gets to the end i.e. when there is no longer any upper child
            return max;
        else
            return max(parent.upperChild);  // keeps going if the next parent has a upper child
    }
}