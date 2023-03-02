public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Driver №" + i, true, 5 + i);
            Car car = new Car(
                    "Car brand №" + i,
                    "Car model №" + i,
                    1.4,
                    driverB,
                    BodyType.COUPE
            );
            DriverC driverC = new DriverC("Driver №" + i, true, 7 + i);
            Truck truck = new Truck(
                    "Truck brand №" + i,
                    "Truck model №" + i,
                    4.0,
                    driverC
            );
            DriverD driverD = new DriverD("Driver №" + i, true, 10 + i);
            Bus bus = new Bus(
                    "Bus brand №" + i,
                    "Bus model №" + i,
                    4.8,
                    driverD,
                    BodyType.HATCHBACK


            );
            printInfo(car);
            printInfo(bus);
            printInfo(truck);



        }
    }
    private static void printInfo(Transport<?> transport){
        System.out.println("Водитель"+transport.getDriver().getName()+"управляет автомобилем"+transport.getBrand()+" и будет учавстовать в заездах");
    }

    @Override
    public String toString() {
        return super.toString();
    }


}