/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise14;

/**
 *
 * @author rosso
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: " + addResult);
        
        // Add exception handling to catch ArithmeticException
        try{
          double divResult = calc.divide(15, 0);        
        System.out.println("Division Result: " + divResult);  
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }
        
    }
}
