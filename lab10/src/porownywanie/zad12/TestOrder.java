package porownywanie.zad12;

import java.util.ArrayList;

public class TestOrder {

    public static void main(String[] args) {
        ArrayList<Order> list = new ArrayList<>();
        list.add(new Order("AA", 3, 45.5));
        list.add(new Order("BB", 5, 52.3));
        list.add(new Order("CC", 4, 11.2));
        list.add(new Order("DD", 3, 22.5));
        list.add(new Order("DD", 2, 22.5));
        for(var elem: list){
            System.out.println(elem);
        }
        list.sort(null);
        System.out.println("After");
        for(var elem: list){
            System.out.println(elem);
        }
    }
}
