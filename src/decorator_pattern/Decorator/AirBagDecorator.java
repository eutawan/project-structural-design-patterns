package decorator_pattern.Decorator;

import decorator_pattern.Interfaces.IVehicle;

public class AirBagDecorator extends VehicleDecorator{
    public AirBagDecorator(IVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public double getPrice() {
        return vehicle.getPrice() + 3000.00;
    }

    @Override
    public String getType() {
        return vehicle.getType() + " with air-bag";
    }
}
