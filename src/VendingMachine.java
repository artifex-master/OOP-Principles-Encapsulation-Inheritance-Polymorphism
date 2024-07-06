public class VendingMachine implements Interface {

    @Override
    public void getProduct(String name, int volume, int temperature) {
        System.out.printf("Product name: %s, Volume: %d, Temperature: %d\n", name, volume, temperature);
    }
}
