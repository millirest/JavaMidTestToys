import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {


        List <toy> toys =  new ArrayList<>();
        double [] weight = new double[3];
        int [] ids = new int[3];
        String [] names = new String[3];
        

        for (int i=0; i < 4; i++){
            toys.add(new toy(i, "name"+i, 4+i));
        }
        
        for (int i =0; i < 3; i++){
            toy theToy = toys.get(i);
            ids[i] = theToy.getId();
            names[i] =theToy.getName();
            weight[i] = theToy.getWeight();
    }

    }
}
