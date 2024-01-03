package porownywanie.zad22;

import java.util.ArrayList;

public class TestAnimal {

    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Animal("AA", 34));
        list.add(new Animal("BB", 34));
        list.add(new Animal("AA", 12));
        list.add(new Dog("AA", 34, "XX"));
        list.add(new Dog("AA", 34, "TT"));
        list.add(new Dog("BB", 12, "6"));
        for(var elem: list){
            System.out.println(elem);
        }
        list.sort(null);
        System.out.println("After sort");
        for(var elem: list){
            System.out.println(elem);
        }
        System.out.println(list.get(2).compareTo(list.get(3)));
    }
}
