/**
   The RetailItem class stores data about a retail item
   for the RetailItem Class programming challenge.
*/

public class RetailItem
{
   private String description;   // Item description
   private int unitsOnHand;      // Number of units on hand
   private double price;         // Unit price

   /**
      This constructor initializes the item's
      description with an empty string, units on hand
      to 0, and price to 0.0.
   */

   public RetailItem()
   {
      description = "";
      unitsOnHand = 0;
      price = 0.0;
   }

   /**
      This constructor initializes the item's
      description, units on hand, and price with
      values passed as arguments.
      @param d The item's description.
      @param u The number of units on hand.
      @param p The item's price.
   */
   
   public RetailItem(String d, int u, double p)
   {
      description = d;
      unitsOnHand = u;
      price = p;
   }

   /**
      The setDescription method sets the item's
      description.
      @param d The item's description.
   */

   public void setDescription(String d)
   {
      description = d;
   }

   /**
      The setUnitsOnHand method sets the item's
      number of units on hand.
      @param u The number of units on hand.
   */

   public void setUnitsOnHand(int u)
   {
      unitsOnHand = u;
   }

   /**
      The setPrice method sets the item's price.
      @param p The item's price.
   */

   public void setPrice(double p)
   {
      price = p;
   }

   /**
      The getDescription method returns the item's
      description.
      @return The item's description.
   */

   public String getDescription()
   {
      return description;
   }

   /**
      The getUnitsOnHand method returns the item's
      number of units on hand.
      @return The units on hand.
   */

   public int getUnitsOnHand()
   {
      return unitsOnHand;
   }

   /**
      The getPrice method rerurns the item's price.
      @return The item's price.
   */

   public double getPrice()
   {
      return price;
   }
}
