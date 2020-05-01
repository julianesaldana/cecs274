package programs.LinkedList;

import java.util.Random;

public class LinkedList {
    private Node head;      // list is going to use a head and utilize "next" of nodes
    public int size = 0;

    public LinkedList() {       // creates empty list with nothing inside except null, doesnt seem to be needed
        head = null;
    }

    public void display(){
        Node temp = head;

        for (int i = 0; i < size; i++){     // goes through the whole list
            if (i % 12 == 0){
                System.out.println("\n");   // for organization
            }
            temp.display();
            temp = temp.getNext();      //iterates through list
            System.out.print(" ");
        }
        System.out.println("\n");
    }

    public void add(String x) {
        size++;
        Node newNode = new Node(x);
        if (head == null) {          // case 1, if no words are in the list
            head = newNode;          // sets newNode as the head, in which a null is "next" because of default Node constructor
        } else {
            Node cur = head.getNext();     // keeps track of nodes in the list, set to one ahead
            Node prev = head;              // set to one behind
            if (newNode.getValue().compareTo(head.getValue()) <= 0) {    // covers if new node is the smallest
                newNode.setNext(head);      // "next" of new node becomes the head
                head = newNode;             // moves new node to the front, with the ending being null
            }
            else {
                while (cur != null && (newNode.getValue().compareTo(cur.getValue()) >= 0)) { // checks until end of list right before cur becomes null
                    prev = cur;
                    cur = cur.getNext();
                }
                newNode.setNext(cur); // sets the "next" of new node
                prev.setNext(newNode); // sets the previous nodes "next" as the new node
            }
        }
    }

    public int find(String word) {
        Node temp = head;
        int location = 1;
        while(temp != null) {
            if(temp.getValue().compareTo(word.toLowerCase()) == 0) {
                return location;
            }
            else {
                temp = temp.getNext();
                location++;
            }
        }
        return 0;
    }

    public void delete() {
        Random rand = new Random();
        int rand_num = rand.nextInt(size) + 1;

        Node cur = head;
        Node prev = cur;

        int location = 1;
        String removed = "";
        if (rand_num == 1) {
            removed = head.getValue();
            head = head.getNext();
        }
        else {
            while(location < rand_num) {
                prev = cur;
                cur = cur.getNext();
                location++;
                removed = cur.getValue();
            }
            prev.setNext(cur.getNext());
        }
        size--;
        System.out.printf("\n%s was removed from location %d\n\n", removed, rand_num);
    }
//    public void addToFront(String x){     don't need for this case
//        Node temp = new Node(x);
//        temp.setNext(head);
//        head = temp;
//    }
}
