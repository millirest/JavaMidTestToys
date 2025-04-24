public class App {
    public static void main(String[] args) throws Exception {


        // List <toy> toys =  new ArrayList<>();
        // double [] weight = new double[3];
        // int [] ids = new int[3];
        // String [] names = new String[3];
        // toys.add(new toy(0, "name1", 100));
        // toys.add(new toy(1, "name2", 90));
        // toys.add(new toy(2, "name2", 95));
        // // for (int i=1; i < 5; i++){
        // //     toys.add(new toy(i, "name"+i, 4+i));
        // // }

        // for (int i =0; i < 3; i++){
        //     toy theToy = toys.get(i);
        //     ids[i] = theToy.getId();
        //     names[i] =theToy.getName();
        //     weight[i] = theToy.getWeight();
        // }

        ToyStore store = new ToyStore();

        // add toys
        store.addToy(1, "Toy 1", 30);
        store.addToy(2, "Toy 2", 10);
        store.addToy(3, "Toy 3", 60);

        store.getPrize(10);

        
        // Queue<toy> queue = new PriorityQueue<>(3, Comparator.comparingDouble(toy::getWeight));

        // for (int i = 0; i < 3; i++){
        //     queue.offer(toys.get(i));
        // }

        // try (PrintWriter writer = new PrintWriter(new File("output.txt"))) {
        //     writer.println("ID Name Weight");
        //     for (int i = 0; i < 10; i++){
        //         toy theToy = queue.poll();
        //         System.out.println(theToy);
        //         writer.println(theToy.getId()+" "+theToy.getName()+" "+ theToy.getWeight());
        //         queue.offer(theToy);
        //     }
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
    }

}
