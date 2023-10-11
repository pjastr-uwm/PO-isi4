import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(456);
        int a = random.nextInt();
        System.out.println(a);
    }
}
