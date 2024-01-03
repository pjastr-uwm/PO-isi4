package komparator.zad11;

import java.util.ArrayList;
import java.util.Arrays;

public class TestProduct {

    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(34, "WW", 34.2));
        list.add(new Product(12, "ZZ", 12.2));
        list.add(new Product(77, "TT", 76.2));
        list.add(new Product(99, "DD", 34.9));
        list.add(new Product(54, "TT", 34.2));
        for(var elem: list){
            System.out.println(elem);
        }
        list.sort(new PriceComparator().thenComparing(new NameComparator()));
        System.out.println("After sort");
        for(var elem: list){
            System.out.println(elem);
        }
    }
}
