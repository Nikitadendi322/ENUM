import java.util.ArrayList;
import java.util.List;

public class TestCar {
    public static void main(String[] args, Object e) throws NoLicenseException {

    }
    public static void testList()throws NoLicenseException{
        DriverB driverB=new DriverB(
                "Driver B",
                true,
                5
        );
        DriverC driverC=new DriverC(
                "Driver C",
                true,
                5
        );
        DriverD driverD=new DriverD(
                "Driver D",
                true,
                5
        );

        Car car=new Car("Opel","Astra",12,123,BodyType.HATCHBACK,LoadCapacity.getValue());
        Bus bus=new Bus("Mercedes","Conecto",13,1,BodyType.PICKUP);
        Truck truck=new Truck("Белаз","2344",2340,1,BodyType.CROSSOVER,);

        List<Transport> racer=new ArrayList<>();

    }

    private static class NoLicenseException extends Exception {
    }



}