package org.example;
import java.lang.reflect.Field;
import java.util.ArrayList;
public class FleetOfCars {

    protected ArrayList<Car> fleet = new ArrayList<>();
    protected TextUI ui = new TextUI();
    protected FileIO io = new FileIO();

    public void setup() {
        readGasolineCars();
        readDieselCars();
        readElectricCars();

        for (Car car : fleet) {
            ui.displayMessage(car.toString());
        }

        getTotalRegistrationFeeForFleet();
        ui.displayMessage("\nTotal fee for all cars: " + getTotalRegistrationFeeForFleet());
    }

    public void addCar(Car c) {
        fleet.add(c);
    }

    public int getTotalRegistrationFeeForFleet() {
        int sumFee = 0;
        for (Car car : fleet) {
            sumFee += car.getRegistrationFee();
        }
        return sumFee;
    }
    public String toString() {
        return fleet.toString();
    }
    public void readGasolineCars() {
        ui.displayMessage("Gasoline cars:");
        ArrayList<String> data = io.readCarData("src/main/java/org/example/gasolinecars.csv");
        for (String s : data) {
            String[] row = s.split(",");
            String registrationNumber = row[0];
            String carBrand = row[1];
            String carModel = row[2];
            int numberOfDoors = Integer.parseInt(row[3]);
            int kmPrLitre = Integer.parseInt(row[4]);
            GasolineCar gas = new GasolineCar(registrationNumber, carBrand, carModel, numberOfDoors, kmPrLitre);
            addCar(gas);
        }
    }
    public void readDieselCars() {
        ui.displayMessage("Diesel cars:");
        ArrayList<String> data = io.readCarData("src/main/java/org/example/dieselcars.csv");
        for (String s : data) {
            String[] row = s.split(",");
            String registrationNumber = row[0];
            String make = row[1];
            String model = row[2];
            int numberOfDoors = Integer.parseInt(row[3]);
            int kmPrLitre = Integer.parseInt(row[4]);
            boolean particleFilter = Boolean.parseBoolean(row[5]);

            DieselCar diesel = new DieselCar(registrationNumber, make, model, numberOfDoors, kmPrLitre, particleFilter);
            addCar(diesel);
        }
    }

    public void readElectricCars() {
        ui.displayMessage("Electric cars:");
        ArrayList<String> data = io.readCarData("src/main/java/org/example/electriccars.csv");
        for (String s : data) {
            String[] row = s.split(",");
            String registrationNumber = row[0];
            String carBrand = row[1];
            String carModel = row[2];
            int numberOfDoors = Integer.parseInt(row[3]);
            int batteryCapacity = Integer.parseInt(row[4]);
            int maxRange = Integer.parseInt(row[5]);
            ElectricCar el = new ElectricCar(registrationNumber, carBrand, carModel, numberOfDoors, batteryCapacity, maxRange);
            addCar(el);
        }
    }
}