package komparator.zad11;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product obj1, Product obj2) {
        return Double.compare(obj1.getPrice(), obj2.getPrice());
    }
}
