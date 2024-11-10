package decorator_pattern.Decorator;

import decorator_pattern.Interfaces.IVehicle;

public class AirBargDecorator extends VehicleDecorator{
    public AirBargDecorator(IVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public double getPrice() {
        return vehicle.getPrice() + 3000.89;
    }

    @Override
    public String getType() {
        return vehicle.getType() + " with air-barg";
    }
}
