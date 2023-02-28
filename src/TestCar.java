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

        Car car=new Car("Opel","Astra",12,123,BodyType.HATCHBACK);
        Bus bus=new Bus("Mercedes","Conecto","13","B",BodyType.PICKUP);



    }

    private static class NoLicenseException extends Exception {
    }
}