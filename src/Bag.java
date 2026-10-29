import java.util.ArrayList;

public class Bag extends InventoryComponent{ 
    private String name;
    private double baseWeight;
    ArrayList<InventoryComponent> items;

    public Bag (String name, double baseWeight){
        this.name = name;
        this.baseWeight = baseWeight;

        items = new ArrayList<InventoryComponent>();
    }

 @Override
    public String getName(){
        return name;
    }

@Override
    public double getWeight(){
        
        double totalWeight = this.baseWeight;
        for (InventoryComponent component : items) {
            totalWeight += component.getWeight();
        }
        return totalWeight;

    }

@Override 
    public void add(InventoryComponent component) {
        items.add(component);

    }

@Override
    public void remove(InventoryComponent component) {
        items.remove(component);

}

@Override 
    public InventoryComponent getChild(int position) {
       
       return items.get(position);

    }

@Override
    public void displayInfo() {
        System.out.println("\nName: " + name + "BaseWeight: " + baseWeight);

        for(InventoryComponent component  : items) {
            component.displayInfo();
        }
    }
    
}