package zad15;

public class Test15 {

    public static void main(String[] args) {
        Integer[] tab1 = {4,-5,7,-22,88,23,12};
        System.out.println(maxValue(tab1));
        Vehicle[] tab2 = new Vehicle[5];
        tab2[0] = new Vehicle("RR", 4.5);
        tab2[1] = new Vehicle("BB", 33.3);
        tab2[2] = new Vehicle("WW", 12.9);
        tab2[3] = new Vehicle("EE", 6.9);
        tab2[4] = new Vehicle("AA", 4.5);
        System.out.println(maxValue(tab2));
    }

    public static <T extends Comparable<T>> T maxValue(T[] array){
        if (array == null || array.length ==0){
            throw  new IllegalArgumentException();
        }
        T temp = array[0];
        for(T elem: array){
            if (temp.compareTo(elem) <0){
                temp =elem;
            }
        }

        return temp;
    }
}
