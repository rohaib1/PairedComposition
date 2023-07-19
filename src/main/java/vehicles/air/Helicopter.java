package vehicles.air;

import products.IProduct;
import vehicles.Vehicle;

public
class Helicopter extends Vehicle implements IAir{

    private int numOfBlades;
    private double maxAltitude;
    private double maxAirSpeed;

    public Helicopter(float weight, int maxSpeed, IProduct baseProduct, int numOfBlades, double maxAltitude, double maxAirSpeed){
        super(weight,maxSpeed,baseProduct);
        this.numOfBlades = numOfBlades;
        this.maxAltitude = maxAltitude;
        this.maxAirSpeed = maxAirSpeed;
    }

    public
    int getNumOfBlades(){
        return this.numOfBlades;
    }

    public
    void setNumOfBlades(int numOfBlades){
        this.numOfBlades = numOfBlades;
    }

    public double getMaxAltitude(){
        return this.maxAltitude;
    }

    public void setMaxAltitude(double maxAltitude){
        this.maxAltitude = maxAltitude;
    }

    public double getMaxAirSpeed(){
        return this.maxAirSpeed;
    }

    public void setMaxAirSpeed(double maxAirSpeed){
        this.maxAirSpeed = maxAirSpeed;
    }



//    @Override
//    public
//    int getHp(){
//        return this.motor.getHp();
//    }
//
//    @Override
//    public
//    void setHp(int hp){
//        this.motor.setHp(hp);
}
