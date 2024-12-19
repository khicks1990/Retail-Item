/**
   This program demonstrates a solution to the
   RetailItem Class programming challenge.
*/

public class Main
{
   public static void main(String[] args)
   {
      // Create the first item. Use the no-arg constructor.
      RetailItem item1 = new RetailItem();
      item1.setDescription("Jacket");
      item1.setUnitsOnHand(12);
      item1.setPrice(59.95);
      
      // Create the second item. Use the constructor
      // to initialize the fields.
      RetailItem item2 = 
           new RetailItem("Designer Jeans", 40, 34.95);

      // Create the third item. Use the no-arg constructor.
      RetailItem item3 = new RetailItem();
      item3.setDescription("Shirt");
      item3.setUnitsOnHand(20);
      item3.setPrice(24.95);
      
      // Display the info for item1.
      System.out.println("Item #1");
      System.out.println("Description: " + item1.getDescription());
      System.out.println("Units on hand: " + item1.getUnitsOnHand());
      System.out.println("Price: " + item1.getPrice());

      // Display the info for item2.
      System.out.println("\nItem #2");
      System.out.println("Description: " + item2.getDescription());
      System.out.println("Units on hand: " + item2.getUnitsOnHand());
      System.out.println("Price: " + item2.getPrice());

      // Display the info for item3.
      System.out.println("\nItem #3");
      System.out.println("Description: " + item3.getDescription());
      System.out.println("Units on hand: " + item3.getUnitsOnHand());
      System.out.println("Price: " + item3.getPrice());
   }
}

