package kopiowanie.zad19;

public class Engine implements Cloneable{

    private double power;
    private String type;
    private String serialNumber;

    public Engine(double power, String type, String serialNumber) {
        this.power = power;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    public Engine(){}

    @Override
    public Engine clone() throws CloneNotSupportedException{
        return (Engine) super.clone();
    }
}
