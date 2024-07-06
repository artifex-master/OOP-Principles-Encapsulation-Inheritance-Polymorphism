public class Coffee extends HotDrink {
    int temp;

    public Coffee(String name, double price, int temp) {
        super(name, price);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
}
