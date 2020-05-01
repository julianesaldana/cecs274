package programs.Trees;

import programs.LinkedList.Node;

public class treeNode {
    private String value;
    private Node nextSmaller;  // recursively defined object   // recursion
    private Node nextLarger;

    public treeNode (String x){
        value = x;
        nextSmaller = null;
        nextLarger = null;
    }

    public void display(){
        System.out.print(value);
    }

    public Node getNextSmaller(){
        return nextSmaller;
    }

    public Node getNextLarger(){
        return nextLarger;
    }

    public void setNextSmaller(Node n){
        nextSmaller = n;
    }

    public void setNextLarger(Node n){
        nextLarger = n;
    }

    public String getValue(){
        return value;
    }
}
