/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author YOURNAMEHERE
 */
public class Cookie extends DessertItem {
    private int number;
    private int priceper12;
    private int cost;
    
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.number = number;
        this.priceper12 = pricePer12;
        cost = ((number * pricePer12) / 12);
    }

    
    public String toString()
    {
        String name = super.getName();
        String output = number + " lbs. @ $ " + priceper12 + " /lb. \n";
        int widthCookie = DessertShoppe.RECEIPT_WIDTH - name.length();
          output += super.getName() + String.format("%" + widthCookie + "s",
                 DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    @Override
    public int getCost() {
        return cost;
    }
    
}
