//Julian Saldana
//CECS 274-05
//Prog 5 - Binary Search Tree
//May 7, 2020

package programs.Trees;

import programs.LinkedList.Node;

import java.util.Scanner;

public class binarySearchTree {
    public static void main(String[]arg){
        Scanner in = new Scanner(System.in);
        boolean loop = true;
        Tree testTree = new Tree();
        while (loop){
            System.out.println("1) Create empty BST");
            System.out.println("2) Add a number to the BST");
            System.out.println("3) Add 20 random numbers to your BST");
            System.out.println("4) Display the BST in sorted order");
            System.out.println("5) Show Stats");
            int option = in.nextInt();
            switch (option){
                case 1:
                    for (int i = 0; i < 20; i++){
                    }
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                case 5:
                    System.out.println("1) Root");
                    System.out.println("2) Tree height");
                    System.out.println("3) Number of items in the tree");
                    System.out.println("4) Minimum value");
                    System.out.println("5) Maximum value");
                    System.out.println("6) Average value");
                    break;
                default:
                    loop = false;
                    break;
            }
        }
    }
}