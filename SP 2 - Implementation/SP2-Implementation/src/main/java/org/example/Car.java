package org.example;

public interface Car {
    String getRegistrationNumber(); //The number on the number plate
    String getCarBrand(); //The make of the car e.g. Audi
    String getCarModel(); // The model of the car e.g. A6
    int getNumberOfDoors(); // The number of doors
    int getRegistrationFee(); // Calculates the registration fee for the car
}
