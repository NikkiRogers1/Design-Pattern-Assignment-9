public class Main {
    public static void main(String[] args) {
    Item sword = new Item("Iron Sword", 3.5);
    Item healthPotion = new Item("Health Potion", .8);

    Item headBand = new Item("Warped Headband of Intellegence", 1.0);
    Item scroll = new Item("Scroll of Speak with Animals", .2);
    Item speedPotion = new Item("Potion of Speed", 0.2);
    Item rations = new Item("Food Rations", 4); 
    Item herbs = new Item("Balsam", .1);


    Bag backpack = new Bag("Tav's Backpack ", 2.0);
  
    Bag herbPouch = new Bag("Herb Pouch", 1.5);
    Bag pouch = new Bag("Potion Pouch", 0.5);
    Bag bag = new Bag("Bag of Holding", 2.);

   
    backpack.add(headBand);
    backpack.add(scroll);
    backpack.add(rations);
    backpack.add(pouch);
    pouch.add(healthPotion);
    pouch.add(speedPotion);
    pouch.add(herbPouch);
    herbPouch.add(herbs);
    backpack.add(bag);
    bag.add(sword);
    
    System.out.println("=== Full BackPack inventory ===");
    backpack.displayInfo();
    System.out.println("Total weight: " + backpack.getWeight() + " lbs");

    System.out.println("\n=== Potion Pouch test ===");
    pouch.displayInfo();
    System.out.println("Total weight: " + pouch.getWeight() + " lbs");

System.out.println("\n=== Exception Handling test ===");
try {
        sword.add(healthPotion);
    }
    catch (UnsupportedOperationException e) {
    
        System.out.println("Warning: Items cannot contain other items.");
       }
    

    }

    
}
