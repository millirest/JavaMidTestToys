import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {


        List <toy> toys =  new ArrayList<>();
        double [] weight = new double[3];
        int [] ids = new int[3];
        String [] names = new String[3];
        

        for (int i=0; i < 4; i++){
            toys.add(new toy(i, "name"+i, 4+i));
        }
        System.out.println(toys);

        for (int i =0; i < 3; i++){
            toy theToy = toys.get(i);
            ids[i] = theToy.getId();
            names[i] =theToy.getName();
            weight[i] = theToy.getWeight();
        }
        Queue<toy> queue = new PriorityQueue<>(3, Comparator.comparingDouble(toy::getWeight));

        for (int i = 0; i < 3; i++){
            queue.offer(toys.get(i));
        }
        System.out.println(toys);
    }
}
