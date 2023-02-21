public class Bus extends Transport<DriverD> {



    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);

    }


    @Override
    public void startMove() {
        System.out.println("Автобус марки" + getBrand() + "начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки" + getBrand() + "закончил движение");


    }

    @Override
    public Type getType() {
        return Type.BUS;
    }

    @Override
    public void pitStop() {
        System.out.println("PIT-STOP у Автобуса");

    }

    @Override
    public void circleTime() {
        int minFound = 90;
        int maxFound = 150;
        int theBestTimeInMins = (int)(minFound + (maxFound - minFound) * Math.random());
        System.out.println("Лучшее время круга в минутах для автобуса"+theBestTimeInMins);


    }

    @Override
    public void maxSpeed() {
        System.out.println();
        int minFound = 60;
        int maxFound = 130;
        int maxSpeed = (int)(minFound + (maxFound - minFound) * Math.random());
        System.out.println("Максимальная скорость автобуса"+maxSpeed);

    }
}
