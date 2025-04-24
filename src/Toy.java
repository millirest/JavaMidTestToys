public class toy {
    private int id; // 
    private String name; // Имя
    // private int quantity; // Колличество
    private double weight; // Вес

    public toy(int id, String name, double weight) { // int quantity,
        this.id = id;
        this.name = name;
        // this.quantity = quantity;
        this.weight = weight;
    }
    
    //Gets
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // public int getQuantity() {
    //     return quantity;
    // }

    public double getWeight() {
        return weight;
    }


    //Sets
    // public void setId(int id) {
    //     this.id = id;
    // }
    // public void setname(String name) {
    //     this.name = name;
    // }

    // // public void setQuantity(int quantity) {
    // //     this.quantity = quantity;
    // // }

    // public void setWeight(double weight) {
    //     this.weight = weight;
    // }

}