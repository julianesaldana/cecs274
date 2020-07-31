//Julian Saldana
//CECS 274-05
//Prog 5 - Binary Search Tree
//May 7, 2020

package programs.Trees;

import java.util.Random;
import java.util.Scanner;

public class binarySearchTree {
    public static void main(String[]arg){
        Scanner in = new Scanner(System.in);
        boolean loop = true;
        Tree myTree = new Tree();
        while (loop){
            System.out.println("1) Create empty BST");
            System.out.println("2) Add a number to the BST");
            System.out.println("3) Add 20 random numbers to your BST");
            System.out.println("4) Display the BST in sorted order");
            System.out.println("5) Show Stats");
            int option = in.nextInt();
            switch (option){
                case 1:
                    myTree = new Tree();
                    break;
                case 2:
                    System.out.println("What number would you like to add?");
                    int user_num = in.nextInt();
                    myTree.add(user_num);
                    break;
                case 3:
                    System.out.println("Adding 20 random numbers...");
                    for (int i = 0; i < 20; i++) {
                        Random rand = new Random();
                        int rand_num = rand.nextInt(1000);
                        myTree.add(rand_num);
                    }
                    break;
                case 4:
                    myTree.display();
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Root: " + myTree.getRootValue());
                    System.out.println("Tree height: " + myTree.height());
                    System.out.println("Number of items: " + myTree.size());
                    System.out.println("Minimum value: " + myTree.min());
                    System.out.println("Maximum value: " + myTree.max());
                    System.out.println("Average value: " + myTree.sum() / myTree.size());
                    System.out.println();
                    break;
                default:
                    loop = false;
                    break;
            }
        }
    }
}