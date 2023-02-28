import java.util.List;

public class Car extends Transport<DriverB> implements Competing {
    public BodyType bodyType;
    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
        this.bodyType=getBodyType();
        this.setBodyType(bodyType);
    }

    public BodyType getBodyType(){return bodyType;}

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки" + getBrand() + "начал движение");

    }


    @Override
    public int compareTo(Type o) {
        return getType().compareTo(o);
    }

    public static <T extends Enum<T>> T valueOf(Class<T> enumType, String name) {
        return Enum.valueOf(enumType, name);
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
        int theBestTimeInMin = (int) (minFound + (maxFound - minFound) * Math.random());
        System.out.println("Лучшее время круга в минутах для автомобиля" + theBestTimeInMin);


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

    @Override
    public void printType() {

    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}