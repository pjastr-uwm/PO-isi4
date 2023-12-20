package zlozonepola.zad8;

public class Computer {

    private String brand;
    private String model;

    private Processor processor;

    public Computer(String brand, String model, Processor processor) {
        this.brand = brand;
        this.model = model;
        this.processor = processor!= null
                ? new Processor(processor.getFrequency(), processor.getCores(), processor.getManufacturer()) : new Processor();

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processor getProcessor() {
        return new Processor(processor.getFrequency(), processor.getCores(), processor.getManufacturer());
    }

    public void setProcessor(Processor processor) {
        if (processor != null)
            this.processor = new Processor(processor.getFrequency(), processor.getCores(), processor.getManufacturer());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", processor=" + processor +
                '}';
    }
}
