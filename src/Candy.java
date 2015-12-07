/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem{
    private double weight;
    private int pricePerLbs;
    private int cost;

    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

 
    
    @Override
    public String toString()
    {
        String name = super.getName();
        String output = weight + " lbs. @ $" + pricePerLbs + " /lb. \n";
        int widthCandy = DessertShoppe.RECEIPT_WIDTH - name.length();
          output += super.getName() + String.format("%" + widthCandy + "s",
                 DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    @Override
        public int getCost() {
        cost = (int) Math.round(weight * pricePerLbs);
        return cost;
    }
}
