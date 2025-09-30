package advance_dev.Ass2.Ass2_3;

import java.util.ArrayList;
import java.util.List;

public class TrafficManagementSystem {
    private List<Vehicle> vehicles;

    public TrafficManagementSystem() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void displayVehiclesInfo() {
        for (Vehicle v : vehicles) {
            System.out.println("---- " + v.getClass().getSimpleName() + " ----");
            System.out.println("Speed: " + v.getSpeed() + " km/h");
            System.out.println("Fuel consumption: " + v.getFuelConsumption() + " L/km");

            if (v instanceof ElectricVehicle) {
                ElectricVehicle ev = (ElectricVehicle) v;
                System.out.println("Battery level: " + ev.getBatteryLevel() + "%");
            }
            System.out.println();
        }
    }

    public void manageFuelAndBattery() {
        for (Vehicle v : vehicles) {
            if (v instanceof ElectricVehicle) {
                ElectricVehicle ev = (ElectricVehicle) v;
                if (ev.getBatteryLevel() < 20) {
                    System.out.println("⚠ Warning: Low battery on " + v.getClass().getSimpleName());
                }
            } else {
                if (v.getFuelConsumption() > 0.1) {
                    System.out.println("⚠ Warning: High fuel consumption on " + v.getClass().getSimpleName());
                }
            }
        }
    }
}
