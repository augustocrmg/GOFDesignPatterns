package FactoryMethod;

public class CarFactory implements VehicleFactory {
    @Override 
    public Car createVehicle(){
        return new Car();
    }
}
