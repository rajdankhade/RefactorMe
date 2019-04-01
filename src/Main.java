import com.rccl.model.Vehicle;
import com.rccl.model.Vehicle.Type;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.move(Type.CAR);
    }
}
