public class Truck extends Transport<DriverC> {

    private LoadCapacity loadCapacity;
    private BodyType bodyType;


    public Truck(String brand, String model, double engineVolume, int driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity=loadCapacity;
        this.bodyType=getBodyType();
        this.setBodyType(bodyType);

    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки"+getBrand()+"начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик марки"+getBrand()+"закончил движение");

    }
    @Override
    public void pitStop() {
        System.out.println("PIT-STOP у Грузовика");

    }
    @Override
    public Type getType(){
        return Type.TRUCK;
    }

    @Override
    public void printType() {

    }

    public void printType(boolean getLoadCapacity, LoadCapacity loadCapacity){
        if (getLoadCapacity(loadCapacity)==null) {
            System.out.println("Не достаточно данных");
        }else {
            System.out.println(getLoadCapacity);
        }
    }


    @Override
    public void circleTime() {
        int minFound = 60;
        int maxFound = 120;
        int theBestTimeInMins = (int) (minFound + (maxFound - minFound) * Math.random());
        System.out.println("Лучшее время круга в минутах для Грузовика" + theBestTimeInMins);


    }

    @Override
    public void maxSpeed() {
        System.out.println();
        int minFound = 45;
        int maxFound = 98;
        int maxSpeed = (int) (minFound + (maxFound - minFound) * Math.random());
        System.out.println("Максимальная скорость Грузовика" + maxSpeed);
    }
    public LoadCapacity getLoadCapacity(LoadCapacity loadCapacity){return loadCapacity; }



    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}

