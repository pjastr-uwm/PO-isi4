package komparator.zad11;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product obj1, Product obj2) {
        return obj1.getName().compareTo(obj2.getName());
    }
}
