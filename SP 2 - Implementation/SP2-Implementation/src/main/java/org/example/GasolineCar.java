package org.example;
public class GasolineCar extends AFuelCar {
    protected String fuelType;
    public GasolineCar(String registrationNumber, String carBrand,String carModel, int numberOfDoors,int kmPrLitre){
        super(registrationNumber,carBrand,carModel,numberOfDoors);
        this.fuelType = fuelType;
    }
    @Override
    public int getRegistrationFee() { // Punkt 4 - Der står ingen steder i opgaven at denne metode skulle være abstact før nu.
        int registrationFee = 0;

        if(kmPrLitre >= 20 && kmPrLitre <= 50){
            return registrationFee = 330;
        }
        else if (kmPrLitre >= 15 && kmPrLitre <=20){
            return registrationFee = 1050;
        }
        else if(kmPrLitre >= 10 && kmPrLitre <= 15){
            return registrationFee = 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            return registrationFee = 5500;            
        } else if (kmPrLitre <= 5) {
            return registrationFee = 10470;
        }
        return registrationFee;
    }
    @Override
    public String getFuelType() {
        return "Gasoline";
    }
    @Override
    public int kmPrLitre() {
        return 0;
    }
}
