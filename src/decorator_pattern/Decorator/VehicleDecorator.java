package decorator_pattern.Decorator;

import decorator_pattern.Domain.Vehicle;
import decorator_pattern.Interfaces.IVehicle;

public abstract class VehicleDecorator implements IVehicle {
    protected IVehicle vehicle;

    public VehicleDecorator(IVehicle vehicle) {
        this.vehicle = vehicle;
    }
}
