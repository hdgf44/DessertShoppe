/**
 * A Sundae is a type of IceCream. 
 * 
 * A Sundae needs the name of the ice cream being used, 
 * the cost of that ice cream, the name of the topping, and 
 * the cost for the topping. 
 * The cost is determined by adding the cost of the ice cream with 
 * the price of the topping.
 * 
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 * 
 * @author YOURNAMEHERE
 */
public class Sundae extends IceCream{
    
    private String toppingName;
    private int toppingCost;
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
       super(icName, icCost);
       this.toppingCost = toppingCost;
       this.toppingName = toppingName;
    }
    

    
    public String toString()
    {
        String name = super.getName();
        String output = toppingName + " sundae with \n";
        int widthSundae = DessertShoppe.RECEIPT_WIDTH - name.length();
          output += super.getName() + String.format("%" + widthSundae + "s",
                 DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }
    
    @Override
    public int getCost() {
        toppingCost = toppingCost;
        return toppingCost + super.getCost();
    }
    
}
