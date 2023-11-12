package FactoryMethod;

public class ShipFactory implements VehicleFactory {
    @Override
    public Ship createVehicle(){
        return new Ship();
    }
}
    