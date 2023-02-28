import java.util.List;

public class Car extends Transport<DriverB> implements Competing {
    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки" + getBrand() + "начал движение");

    }
    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки" + getBrand() + "закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println("PIT-STOP у Автомобиля");

    }

    @Override
    public void circleTime() {
        int minFound = 150;
        int maxFound = 230;
        int theBestTimeInMins = (int) (minFound + (maxFound - minFound) * Math.random());
        System.out.println("Лучшее время круга в минутах для автомобиля" + theBestTimeInMins);


    }

    @Override
    public void maxSpeed() {
        System.out.println();
        int minFound = 90;
        int maxFound = 270;
        int maxSpeed = (int) (minFound + (maxFound - minFound) * Math.random());
        System.out.println("Максимальная скорость автомобиля" + maxSpeed);
    }

    @Override
    public Type getType() {
        return Type.CAR;
    }

}