package FactoryMethod;

public class VehicleDemo {
    public static void main(String[] args){
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.createVehicle();

        car.accelerate();
        car.enableNitro();
        car.brake();
        
        ShipFactory shipFactory = new ShipFactory();
        Ship ship = shipFactory.createVehicle();

        ship.setWeightTonsCapacity(33);
        ship.accelerate();
        ship.brake();
        ship.anchor();
        ship.getWeightTonsCapacity();
    }
}
