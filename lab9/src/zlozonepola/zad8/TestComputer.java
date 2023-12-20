package zlozonepola.zad8;

public class TestComputer {

    public static void main(String[] args) {
        Processor p1 = new Processor(5,6,"AA");
        Computer c1 = new Computer("EE", "XX", p1);
        System.out.println(c1);
        p1.setFrequency(10);
        System.out.println(c1);
    }
}
