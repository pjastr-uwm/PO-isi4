package zad25;

public class Test25 {

    public static void main(String[] args) {
        Triple<Bird> t1 = new Triple<>(new Bird(), new Eagle(), new Eagle());
        System.out.println(findMin(t1));
        Triple<Eagle> t2 = new Triple<>(new Eagle(), new Eagle(), new Eagle());
        System.out.println(findMin(t2));
        System.out.println(findMinTwo(t1));
        System.out.println(findMinTwo(t2));
    }

    public static Bird findMin(Triple<? extends Bird> arg){
        return arg.getElem1();
    }

    public static Object findMinTwo(Triple<? super Eagle> arg){
        return arg.getElem1();
    }
}
