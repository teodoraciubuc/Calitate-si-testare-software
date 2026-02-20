package ro.ase.acs.clase;

import ro.ase.acs.interfaces.Taxable;

public class Car extends Vehicle implements Taxable {
    private String producer;
    private int productionYear;
    private EngineType engineType;
    private final static float TAX_VALUE = 0.05f;

    public Car() {
    }

    public Car(String producer, int productionYear, float price) {
        super(null, price);
        this.producer = producer;
        this.productionYear = productionYear;
    }

    public String getProducer() {

        return producer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProducer(String producer) {

        this.producer = producer;
    }

    public void setProductionYear(int productionYear) {

        this.productionYear = productionYear;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public float compute() {
        return getPrice() * (TAX_VALUE);
    }
}
