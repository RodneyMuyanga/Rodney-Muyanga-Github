package org.example;
public abstract class AFuelCar extends ACar{
    protected int kmPrLitre;
    public AFuelCar (String registrationNumber,String carBrand,String carModel, int numberOfDoors){
        super(registrationNumber, carBrand, carModel, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }
    public abstract String getFuelType();
    public int kmPrLitre(){ //Dette er meget tvivlsomt beskrevet i opgaven. Skal metoden være abstract eller ej?
        return kmPrLitre;
    }
}