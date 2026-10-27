public class Main {
    public static void main(String[] args) {
    Item sword = new Item("Iron Sword", 3.5);
    Item healthPotion = new Item("Health Potion", .8);

    sword.displayInfo();
    System.out.println(sword.getWeight());

    healthPotion.displayInfo();
    System.out.println(healthPotion.getWeight());

    }
}
