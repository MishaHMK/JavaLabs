package Classes;

public class Sweet implements SweetInter {
    protected String name;
    protected int weight;
    protected int sugar;

    public Sweet(String name, int weight, int sugar) {
        this.name = name;
        this.weight = weight;
        this.sugar = sugar;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getSugar() {
        return sugar;
    }

    @Override
    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString(){
        return "\nСandy: " + this.getName()+ " Weight: " + this.getWeight() + " Sugar: " + this.getSugar()  + "% ";
    }
}
