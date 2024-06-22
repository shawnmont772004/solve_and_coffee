package DSA.BinarySearchTree;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice, key;

        while (true) {
            System.out.println("\nTreeSet Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key to insert: ");
                    key = scanner.nextInt();
                    treeSet.add(key);
                    System.out.println("Inserted " + key);
                    break;
                case 2:
                    System.out.print("Enter key to delete: ");
                    key = scanner.nextInt();
                    if (treeSet.remove(key)) {
                        System.out.println("Deleted " + key);
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter key to search: ");
                    key = scanner.nextInt();
                    if (treeSet.contains(key)) {
                        System.out.println("Key found in the tree.");
                    } else {
                        System.out.println("Key not found in the tree.");
                    }
                    break;
                case 4:
                    System.out.println("TreeSet elements: " + treeSet);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
