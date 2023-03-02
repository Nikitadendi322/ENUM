public class Bus extends Transport<DriverD> {

    private LoadCapacity loadCapacity;
    private BodyType bodyType;


    public Bus(String brand, String model, double engineVolume, DriverD driver,BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.pitStop();
        this.circleTime();
        this.maxSpeed();
        this.getType();
        this.loadCapacity=loadCapacity;
        this.bodyType=getBodyType();
        this.setBodyType(bodyType);


    }

    public Bus(String mercedes, String conecto, int engineVolume, int i, BodyType pickup) {
        super("Mercedes","Conecto",123,1,);
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
    public void printType() {
        if (getLoadCapacity()==null){
            System.out.println("Не достаточно данных");
            }else{
            System.out.println(getLoadCapacity);
            }
        }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
