package decorator_pattern.Decorator;

import decorator_pattern.Interfaces.IVehicle;

public class MultimediaDecorator extends VehicleDecorator{
    public MultimediaDecorator(IVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public double getPrice() {
        return vehicle.getPrice() + 700.50;
    }

    @Override
    public String getType() {
        return vehicle.getType() + " with multimedia";
    }
}
