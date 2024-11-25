import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.Vehicle;

public class FarmVehicle<T extends Rider> extends Vehicle<T> {

    private T rider;
    private String vehicleType;

    public FarmVehicle(T rider, String vehicleType){

        this.rider = rider;
        this.vehicleType = vehicleType;

    }


}
