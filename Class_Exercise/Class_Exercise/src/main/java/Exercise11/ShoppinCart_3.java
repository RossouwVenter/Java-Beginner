/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise11;

/**
 *
 * @author rosso
 */
public class ShoppinCart_3 {
     Item_3[] items = {new Item_3("Shirt",25.60), 
                    new Item_3("WristBand",0), 
                    new Item_3("Pants",35.99)};
    
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
    }
    
    // Use a standard for loop to iterate through the items array, adding up the total price
    //    Skip any items that are back ordered.  Display the Shopping Cart total.
    public void displayTotal(){
        for (int idx = 0; idx < items.length; idx++){
            if (items[idx].isBackOrdered())
                continue;
            total += items[idx].getPrice();
        }
        System.out.println("Shopping Cart total: " + total);
            
    }
}
