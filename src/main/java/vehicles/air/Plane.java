package vehicles.air;
import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public
class Plane extends Vehicle implements IAir, IMotorised {

    private int numOfEngines;
    private double maxAltitude;
    private double maxAirSpeed;
    private IMotorised engine;

    public Plane(float weight, int maxSpeed, IProduct baseProduct, int numOfEngines, double maxAltitude, double maxAirSpeed, IMotorised engine){
        super(weight, maxSpeed, baseProduct);
        this.numOfEngines = numOfEngines;
        this.maxAltitude = maxAltitude;
        this.maxAirSpeed = maxAirSpeed;
        this.engine = engine;
    }

    public
    int getNumOfEngines(){
        return this.numOfEngines;
    }

    public
    void setNumOfEngines(int numOfEngines){
        this.numOfEngines = numOfEngines;
    }

    @Override
    public
    double getMaxAltitude(){
        return this.maxAltitude;
    }

    public
    void setMaxAltitude(double maxAltitude){
        this.maxAltitude = maxAltitude;
    }

    @Override
    public
    double getMaxAirSpeed(){
        return this.maxAirSpeed;
    }

    public
    void setMaxAirSpeed(double maxAirSpeed){
        this.maxAirSpeed = maxAirSpeed;
    }

    @Override
    public
    void startEngine(){
        this.engine.startEngine();
    }

    @Override
    public
    void stopEngine(){
    this.engine.stopEngine();
    }

    @Override
    public
    int getHp(){
        return this.engine.getHp();
    }

    @Override
    public
    void setHp(int hp){
        this.engine.setHp(hp);
    }

    @Override
    public
    int getFuel(){
        return this.engine.getFuel();
    }

    @Override
    public
    void setFuel(int fuel){
        this.engine.setFuel(fuel);
    }
}
