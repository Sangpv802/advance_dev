package advance_dev.Ass2.Ass2_3;

public class Main {
    public static void main(String[] args) {
        TrafficManagementSystem system = new TrafficManagementSystem();

        Car car = new Car(0.08, 0);                 // ô tô thường
        ElectricCar eCar = new ElectricCar(0, 50);  // ô tô điện (pin 50%)
        Motorcycle moto = new Motorcycle(0.12, 0);  // xe máy

        system.addVehicle(car);
        system.addVehicle(eCar);
        system.addVehicle(moto);

        car.startEngine();
        eCar.startEngine();
        moto.startEngine();

        System.out.println("\n--- Vehicle Info ---");
        system.displayVehiclesInfo();

        System.out.println("\n--- Fuel & Battery Check ---");
        system.manageFuelAndBattery();

        // thử sạc pin xe điện
        eCar.chargeBattery(40);
        System.out.println("\nAfter charging battery:");
        system.displayVehiclesInfo();
    }
}
