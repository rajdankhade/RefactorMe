import com.rccl.model.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Vehicle(Vehicle.Type.CAR);
        car.move();
    }
}
