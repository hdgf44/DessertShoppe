/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem {

    private int cost;
    private String toppingName;
    
    public IceCream(String name, int cost)
    {
        super(name);
        this.cost = cost;
    }

  
    public String toString()
    {
        String name = super.getName();
        String output = "";
        int widthIceCream = DessertShoppe.RECEIPT_WIDTH - name.length();
          output += super.getName() + String.format("%" + widthIceCream + "s",
                 DessertShoppe.cents2dollarsAndCents(cost));
        return output;
    }

    @Override
    public int getCost() {
  
        return cost;
    }
    
    public IceCream(String toppingName) {
      this.toppingName = toppingName;
  }
    
    public final String getToppingName() {
    return toppingName;
  }
    
}
