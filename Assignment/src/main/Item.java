package main;

public class Item {
    private String name;
    private double cost;
    private boolean imported;

    public Item(String name, double cost, boolean imported) {
        this.name=name;
        this.cost=cost;
        this.imported=imported;
    }

    public Item() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {       
        return cost;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    public boolean getImported() {
        return imported;
    }

}
