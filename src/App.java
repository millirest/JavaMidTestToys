public class App {
    public static void main(String[] args) throws Exception {


        ToyStore store = new ToyStore();

        // add toys
        store.addToy(1, "Toy 1", 30);
        store.addToy(2, "Toy 2", 10);
        store.addToy(3, "Toy 3", 60);


        // get toy prize
        store.getPrize(10);
    }

}
