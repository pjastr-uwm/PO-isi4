package komparator.zad1;

import java.util.Comparator;

public class WiekComprator implements Comparator<Osoba> {
    @Override
    public int compare(Osoba obj1, Osoba obj2) {
        return Integer.compare(obj1.getWiek(), obj2.getWiek());
    }
}
