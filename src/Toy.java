public class toy {
    private int id; // 
    private String name; // Имя
    private double weight; // Вес

    public toy(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }


    // Sets
    public void setId(int id) {
        this.id = id;
    }
    public void setname(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}