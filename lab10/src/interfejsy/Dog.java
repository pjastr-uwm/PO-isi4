package interfejsy;

public class Dog implements LoudAnimal{
    @Override
    public void makeNoise() {
        System.out.println("Dog");
    }
}
