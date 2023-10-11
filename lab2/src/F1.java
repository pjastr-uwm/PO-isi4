import java.util.Random;

public class F1 {
    public static void main(String[] args) {
        int tab1[] = {3,4,-5,5,3,-9,2,3,2,1};
        for(int i=tab1.length-1; i>=0;i--)
        {
            System.out.println(tab1[i]);
        }
        Random random = new Random();
        random.setSeed(1234);
        int tab2[] = new int[10];
        for(int i=0;i<tab2.length;i++)
        {
            tab2[i] = random.nextInt(21);
        }
        for(int i=tab2.length-1; i>=0;i--)
        {
            System.out.println(tab2[i]);
        }
    }
}
