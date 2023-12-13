package rekordy.zad1;

public class TestBookDTO {

    public static void main(String[] args) {
        BookDTO b1 = new BookDTO("AA","XX", 45.3, 2020);
        System.out.println(b1);
        BookDTO b2 = new BookDTO(new String("AA"),"XX", 45.3, 2020);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode() == b2.hashCode());
        System.out.println(b1.price());
        System.out.println(b1.title());
        //b1.price() = 45.3;
    }
}
