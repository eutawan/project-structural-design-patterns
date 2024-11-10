package decorator_pattern.Domain;

import decorator_pattern.Interfaces.IVehicle;

public class Vehicle implements IVehicle {
    private String type;
    private Double price;

    public Vehicle(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
