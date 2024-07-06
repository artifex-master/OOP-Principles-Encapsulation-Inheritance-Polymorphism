public class Cacao extends HotDrink {
    int temp;
    public Cacao(String name, double price, int temp) {
        super(name, price);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
}
