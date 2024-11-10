package decorator_pattern;

import decorator_pattern.Decorator.AirBagDecorator;
import decorator_pattern.Decorator.AirConditionDecorator;
import decorator_pattern.Decorator.MultimediaDecorator;
import decorator_pattern.Domain.Vehicle;
import decorator_pattern.Interfaces.IVehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Client 1");
        IVehicle client1 = new Vehicle("client1", 200000.23);
        client1 = new AirConditionDecorator(client1);
        client1 = new MultimediaDecorator(client1);

        System.out.println(client1.getType() + " Cost R$ " + client1.getPrice());

        System.out.println("\nClient 2");
        IVehicle client2 = new Vehicle("Bmw320i", 230000.34);
        client2 = new AirConditionDecorator(client2);
        client2 = new AirBagDecorator(client2);

        System.out.println(client2.getType() + " Cost R$ " + client2.getPrice());
    }
}