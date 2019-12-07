public class carCar {
    private String model;
    private int count;
    private double price;

    public carCar(String model, double price, int count) {
        this.model = model;
        this.price = price;
        this.count = count;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
    public int getCount() {
        return count;
    }
}
