import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ToyStore {
    private List<toy> toys;
    private List<toy> prizeToys;

    public ToyStore() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public void addToy(int id, String name, double weight) {
        toy theToy = new toy(id, name, weight);
        toys.add(theToy);
    }

    public void setToyWeight(int id, double weight) {
        for (toy theToy : toys) {
            if (theToy.getId() == id) {
                theToy.setWeight(weight);
                break;
            }
        }
    }
        public void getPrize(int attempt){
            double totalWeight = 0;
            for (toy theToy : toys) {
                totalWeight += theToy.getWeight();
            }
            for( int i = 0; i< attempt;i++){
                Random rand = new Random();
                double randomNumber = rand.nextDouble() * totalWeight;
                toy prizeToy = null;
                for (toy theToy : toys) {
                    if (randomNumber < theToy.getWeight()) {
                        prizeToy = theToy;
                        break;
                    }
                    randomNumber -= theToy.getWeight();
                }
                prizeToys.add(prizeToy);
            }
            Queue<toy> queue = new PriorityQueue<>(3, Comparator.comparingDouble(toy::getWeight));
            for (int i = 0; i < attempt; i++){
                queue.offer(prizeToys.get(i));
            }
            try (PrintWriter writer = new PrintWriter(new File("output.txt"))) {
                writer.println("ID Name Weight");
                for (int i = 0; i < attempt; i++){
                    toy prizeToy = queue.poll();
                    writer.println(prizeToy.getId()+" "+prizeToy.getName()+" "+ prizeToy.getWeight());
                    System.out.println(prizeToy.getId()+" "+prizeToy.getName()+" "+ prizeToy.getWeight());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
