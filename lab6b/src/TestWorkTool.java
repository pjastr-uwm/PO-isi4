import pl.edu.uwm.a1.Hammer;
import pl.edu.uwm.a1.Saw;
import pl.edu.uwm.a1.Screwdriver;
import pl.edu.uwm.a1.WorkTool;

import java.util.ArrayList;

public class TestWorkTool {

    public static void main(String[] args) {
        ArrayList<WorkTool> lista = new ArrayList<>();
        lista.add(new Hammer());
        lista.add(new Hammer());
        lista.add(new Screwdriver());
        lista.add(new Saw());
        lista.add(new Screwdriver());
        for(WorkTool elem: lista){
            elem.use();
        }
    }
}
