package ro.ase.acs.clase;

public abstract class Vehicle {
    private String color;
    private float price;
    private final static float VAT_VALUE = 0.21f;

    public Vehicle() {
    }

    public Vehicle(String color, float price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float computerFinalPrice() {
        return getPrice() * (1 + VAT_VALUE);
    }
}
