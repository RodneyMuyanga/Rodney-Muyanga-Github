package org.example;

public class DieselCar extends AFuelCar{
    protected boolean particleFilter;

    public DieselCar(String registrationNumber, String carBrand, String carModel, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter) {
        super(registrationNumber, carBrand, carModel, numberOfDoors);
        this.particleFilter = particleFilter;
    }
    public boolean hasParticleFilter(){
        return particleFilter;
    }
    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;
        int noFilter = 1000;

        if(kmPrLitre >= 20 && kmPrLitre <= 50){
            return registrationFee = 330 + 130;
        }
        else if (kmPrLitre >= 15 && kmPrLitre <=20){
            return registrationFee = 1050 + 1390;
        }
        else if(kmPrLitre >= 10 && kmPrLitre <= 15){
            return registrationFee = 2340 + 1850;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            return registrationFee = 5500 + 2770;
        } else if (kmPrLitre <= 5) {
            return registrationFee = 10470 + 15260;
        }
            if (particleFilter) {
                return registrationFee;
            } else {
                return registrationFee + noFilter;
            }
    }
    @Override
    public String getFuelType() {
        return "Diesel";
    }
    @Override
    public int kmPrLitre() {
        return 0;
    }
}
