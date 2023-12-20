package porownywanie.zad1;

import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("AA", 4.5, 2020));
        list.add(new Student("BB", 6.2, 2016));
        list.add(new Student("AA", 2.7, 2012));
        list.add(new Student("CC", 8.2, 2015));
        list.add(new Student("DD", 4.5, 2020));
        for(var elem:list){
            System.out.println(elem);
        }
        list.sort(null);
        System.out.println("After sorting");
        for(var elem:list){
            System.out.println(elem);
        }
    }
}
