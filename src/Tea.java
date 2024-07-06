public class Tea extends HotDrink {
    int temp;

    public Tea(String name, double price, int temp) {
        super(name, price);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
}
