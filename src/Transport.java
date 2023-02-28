public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private Driver driver;



    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setDriver(driver);
    }

    public String name() {
        return getType().name();
    }

    public int ordinal() {
        return getType().ordinal();
    }

    public int compareTo(Type o) {
        return getType().compareTo(o);
    }

    public Class<Type> getDeclaringClass() {
        return getType().getDeclaringClass();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) ;
        {
            engineVolume = 1.6;
        }
        this.engineVolume = engineVolume;
    }



    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract Type getType();

    public abstract void printType();


    @Override
    public String toString() {
        return "Марка: " + brand + ", " +
                "Модель: " + model + ", " +
                "Объем двигателя: " + engineVolume;
    }

    @Override
    public void pitStop() {

    }

    @Override
    public void circleTime() {

    }

    @Override
    public void maxSpeed() {

    }

    public Driver getDriver() {
        return null;
    }
}
