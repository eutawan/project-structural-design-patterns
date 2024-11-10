package decorator_pattern.Decorator;

import decorator_pattern.Interfaces.IVehicle;

public class AirConditionDecorator extends VehicleDecorator {
    public AirConditionDecorator(IVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public double getPrice() {
        return vehicle.getPrice() + 4000.00;
    }

    @Override
    public String getType() {
        return vehicle.getType() + " with air condition";
    }
}
