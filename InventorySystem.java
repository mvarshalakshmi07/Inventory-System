import java.util.*;
public class InventorySystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> inventory = new HashMap<>();
        int choice = 0;

        while (choice != 5) {
            System.out.println("===== Inventory Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Inventory");
            System.out.println("3. Update Stock");
            System.out.println("4. Remove Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = s.nextInt();
                s.nextLine();

                if (choice == 1) {
                    System.out.print("Enter Product Name: ");
                    String product = s.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = s.nextInt();
                    s.nextLine();

                    inventory.put(product, qty);
                    System.out.println("Product added successfully!");

                }

                else if (choice == 2) {
                    if (inventory.isEmpty()) {
                        System.out.println("Inventory is empty.");
                    } 
                    else {
                        System.out.println("Current Inventory:");
                        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                            System.out.println(entry.getKey() + " : " + entry.getValue());
                        }
                    }

                }
                else if (choice == 3) {

                    System.out.print("Enter Product Name to update: ");
                    String product = s.nextLine();

                    if (inventory.containsKey(product)) {

                        System.out.print("Enter New Quantity: ");
                        int newQty = s.nextInt();
                        s.nextLine();

                        inventory.put(product, newQty);
                        System.out.println("Stock updated successfully!");
                    } 
                    else {
                        System.out.println("Product not found.");
                    }

                }
                else if (choice == 4) {
                    System.out.print("Enter Product Name to remove: ");
                    String product = s.nextLine();

                    if (inventory.containsKey(product)) {
                        inventory.remove(product);
                        System.out.println("Product removed.");
                    } 
                    else {
                        System.out.println("Product not found.");
                    }
                }
                else if (choice == 5) {
                    System.out.println("Exiting program...");
                }
                else {
                    System.out.println("Invalid choice!");
                }
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter numbers only.");
                s.nextLine();
            }
        }
        s.close();
    }
}