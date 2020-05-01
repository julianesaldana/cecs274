package programs.Trees;

import programs.LinkedList.Node;

public class Tree {
    private treeNode head;      // list is going to use a head and utilize "next" of nodes
    public int size = 0;

    public Tree() {       // creates empty list with nothing inside except null, doesnt seem to be needed
        head = null;
    }

//    public void add(String x) {
//        size++;
//        Node newNode = new Node(x);
//        if (head == null) {          // case 1, if no words are in the list
//            head = newNode;          // sets newNode as the head, in which a null is "next" because of default Node constructor
//        } else {
//            Node cur = head.getNext();     // keeps track of nodes in the list, set to one ahead
//            Node prev = head;              // set to one behind
//            if (newNode.getValue().compareTo(head.getValue()) <= 0) {    // covers if new node is the smallest
//                newNode.setNext(head);      // "next" of new node becomes the head
//                head = newNode;             // moves new node to the front, with the ending being null
//            }
//            else {
//                while (cur != null && (newNode.getValue().compareTo(cur.getValue()) >= 0)) { // checks until end of list right before cur becomes null
//                    prev = cur;
//                    cur = cur.getNext();
//                }
//                newNode.setNext(cur); // sets the "next" of new node
//                prev.setNext(newNode); // sets the previous nodes "next" as the new node
//            }
//        }
//    }
}
