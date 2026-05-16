package Encapsulation;

public class Car {
    private String make;
    private String model;
    private int years;
    private int mileage;
    private double fuelLevel;

    Car(String make,String model,int years){
        this.make = make;
        this.model = model;
        this.years = years;
        this.mileage = 0;
        this.fuelLevel = 0;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYears(){
        return years;
    }

    public int getMileage(){
        return mileage;
    }

    public void addFuel(double gallons){
        if(gallons <= 0){
            System.out.println("Invalid fuel amount");
            return;
        }

         if(fuelLevel+gallons > 15){
             fuelLevel = 15;
             System.out.println("Tank is full. Extra fuel not added");
         }
          else{
              fuelLevel += gallons;
              System.out.println("Fuel added successful");
         }

    }
}
