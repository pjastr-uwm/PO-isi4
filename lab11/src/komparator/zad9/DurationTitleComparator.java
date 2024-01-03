package komparator.zad9;

import java.util.Comparator;

public class DurationTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song obj1, Song obj2) {
        int base = Integer.compare(obj1.getDuration(), obj2.getDuration());
        if (base!=0)
            return  base;
        return obj1.getTitle().compareTo(obj2.getTitle());
    }
}
