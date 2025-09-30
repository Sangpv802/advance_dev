package advance_dev.Ass2.Ass2_2;


public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(0),
            new Bicycle(0),
            new Motorcycle(0)
        };

        for (Vehicle v : vehicles) {
            v.start();
            System.out.println(v.getClass().getSimpleName() + " started with speed: " + v.getSpeed() + " km/h");
        }

        System.out.println("\nStopping all vehicles...");
        for (Vehicle v : vehicles) {
            v.stop();
            System.out.println(v.getClass().getSimpleName() + " stopped, current speed: " + v.getSpeed() + " km/h");
        }
    }
}
