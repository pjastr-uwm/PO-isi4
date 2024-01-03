package komparator.zad1;

import java.util.Arrays;

public class TestOsoba {

    public static void main(String[] args) {
        Osoba[] tab  = new Osoba[5];
        tab[0] = new Osoba("AA", 45, 123);
        tab[1] = new Osoba("VV", 12, 167);
        tab[2] = new Osoba("BB", 33, 178);
        tab[3] = new Osoba("TT", 19, 144);
        tab[4] = new Osoba("AA", 12, 155);
        for(var elem: tab){
            System.out.println(elem);
        }
        Arrays.sort(tab, new WiekComprator());
        System.out.println("After sort");
        for(var elem: tab){
            System.out.println(elem);
        }
    }
}
