package zlozonepola.zad3;

public class TestComputerGame {

    public static void main(String[] args) {
        double[] tab = {3.4, 5.2, 1.2};
        ComputerGame c1 = new ComputerGame("AA", "BB", tab);
        System.out.println(c1);
        double[] temp = c1.getRatings();
        temp[2] = 20;
        System.out.println(c1);
        ComputerGame c2 = new ComputerGame("AA", "BB", new double[]{3.4, 5.2, 1.2});
        System.out.println(c1.equals(c2));
    }
}
