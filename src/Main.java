public class Main {
    public static void main(String[] args) {
    Item sword = new Item("Iron Sword", 3.5);
    Item healthPotion = new Item("Health Potion", .8);

   Bag bag = new Bag("Belt Pouch",0.5);

   

    sword.displayInfo();
    System.out.println(sword.getWeight() + " lbs");

    

    healthPotion.displayInfo();
    System.out.println(healthPotion.getWeight() + " lbs");

    
    bag.add(sword);
    bag.add( healthPotion);
    bag.displayInfo();
    System.out.println("Total Weight: " + bag.getWeight() + " lbs");

    

    }
}
