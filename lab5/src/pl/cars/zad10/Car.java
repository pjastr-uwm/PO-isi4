package pl.cars.zad10;

class Car {
    private String brand;
    private String model;
    private double price;

    {
        price = 50000;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        //this.price = 24000;
    }
}
