package org.example;

public abstract class ACar implements Car {
    String registrationNumber;
    String carBrand;
    String carModel;
    int numberOfDoors;

    public ACar(String registrationNumber,String carBrand,String carModel,int numberOfDoors){
        this.registrationNumber = registrationNumber;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.numberOfDoors = numberOfDoors;
    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public String getCarBrand(){
        return carBrand;
    }
    public String getCarModel(){
        return carModel;
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    @Override
public String toString(){
        return getCarBrand() + getCarModel() + getRegistrationNumber() + getNumberOfDoors();
    }
}
