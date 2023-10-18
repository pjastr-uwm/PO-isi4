import java.util.ArrayList;
import java.util.Arrays;

public class G10 {

    public static void main(String[] args) {
        ArrayList<Integer> lt = new ArrayList<>();
        lt.add(-4);
        lt.add(112);
        lt.add(-34);
        System.out.println(lt);
        ArrayList<Integer> kopia = copyArray(lt);
        System.out.println(kopia);
        ArrayList<Integer> pusta = new ArrayList<>();
        ArrayList<Integer> kopia2 = copyArray(pusta);
        System.out.println(pusta);
        System.out.println(kopia2);
        //ArrayList<Integer> lt2 = null;
        //ArrayList<Integer> kopia3 = copyArray(lt2);
    }

    public static ArrayList<Integer> copyArray(ArrayList<Integer> arg)
    {
        /*if (arg == null)
        {
            throw new IllegalArgumentException("Argument jest nullem");
        }*/
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<arg.size();i++)
        {
            temp.add(arg.get(i));
        }
        return temp;
    }
}
