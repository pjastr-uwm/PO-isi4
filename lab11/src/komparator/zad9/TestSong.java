package komparator.zad9;

import java.util.Arrays;

public class TestSong {

    public static void main(String[] args) {
        Song[] tab = new Song[5];
        tab[0] = new Song("AA", "HH", 45);
        tab[1] = new Song("BB", "HH", 33);
        tab[2] = new Song("AA", "WW", 12);
        tab[3] = new Song("CC", "HH", 33);
        tab[4] = new Song("DD", "TT", 45);
        for(var elem: tab){
            System.out.println(elem);
        }
        Arrays.sort(tab, new DurationTitleComparator());
        System.out.println("After sort");
        for(var elem: tab){
            System.out.println(elem);
        }
    }
}
