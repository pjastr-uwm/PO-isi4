package zad12;

import java.util.Arrays;

public class Test12 {

    public static void main(String[] args) {
        String[] t1 = {"dsdf", "JJ", "fg", "TT", "AA"};
        swap(t1, 1,3);
        System.out.println(Arrays.toString(t1));
    }

    public static <T> void swap(T[] array, int ind1, int ind2){
        if (array == null || array.length ==0){
            throw new IllegalArgumentException("Tablica jest nullem lub jest pusta");
        }
        if (ind1 <0 || ind1>= array.length || ind2<0 || ind2>= array.length){
            throw new IllegalArgumentException("Błędny indeks");
        }
        T temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2]= temp;
    }
}
