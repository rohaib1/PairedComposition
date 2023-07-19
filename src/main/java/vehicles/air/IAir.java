package vehicles.air;

import vehicles.IVehicle;

public
interface IAir extends IVehicle{

    double getMaxAltitude();
    void setMaxAltitude(double alt);
    double getMaxAirSpeed();
    void setMaxAirSpeed(double maxAirSpeed);

}
