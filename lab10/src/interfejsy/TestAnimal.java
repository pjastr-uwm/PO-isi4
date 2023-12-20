package interfejsy;

import java.util.ArrayList;

public class TestAnimal {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeNoise();
        Cat c1 = new Cat();
        c1.makeNoise();
        ArrayList<LoudAnimal> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Dog());
        for(var elem: list){
            elem.makeNoise();
        }
    }
}
