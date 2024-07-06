//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HotDrink drink1 = new HotDrink("Coffee Latte", 12.06);
        Coffee coffee1 = new Coffee("Espresso", 34, 26);
        Tea tea1 = new Tea("Iced Mocha", 15, 34);
        Cacao cacao1 = new Cacao("Nesquick", 13, 25);

        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();
        VendingMachine vm3 = new VendingMachine();

        vm1.getProduct("Latte", 12,45);
        vm2.getProduct("Capuccino", 45, 34);
        vm3.getProduct("Iced Brew", 34, 56);

        System.out.println(tea1.getName());
        System.out.println(tea1.getPrice());
        System.out.println(tea1.getTemp() + "\n");

        System.out.println(cacao1.getName());
        System.out.println(cacao1.getPrice());
        System.out.println(cacao1.getTemp() + "\n");
    }
}