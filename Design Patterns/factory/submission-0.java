interface Vehicle {
    String getType();
}

class Car implements Vehicle {
    @Override
    public String getType() {
        return "Car";
    }
}

class Bike implements Vehicle {
    @Override
    public String getType() {
        return "Bike";
    }
}

class Truck implements Vehicle {
    @Override
    public String getType() {
        return "Truck";
    }
}

abstract class VehicleFactory {
    abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactory {
    // Write your code here
    CarFactory CarFactory() { return new CarFactory(); }

    Car createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactory {
    // Write your code here
    BikeFactory BikeFactory() { return new BikeFactory(); }

    Bike createVehicle() {
        return new Bike();
    }
}

class TruckFactory extends VehicleFactory {
    // Write your code here
    TruckFactory TruckFactory() { return new TruckFactory(); }

    Truck createVehicle() {
        return new Truck();
    }
}
