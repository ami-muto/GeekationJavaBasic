package objectExercise;

public class Land extends Property {
    private double size;

    public Land(String name, String owner, int price, double size) {
        super(name, owner, "土地", price);
        this.size = size;
    }

    public void printInfo() {
        super.printCommonInfo();
        System.out.println("広さ:" + size + "m");
        System.out.println("=============================");
    }
    
    public double getSize() { return size; }
    public void setSize(double size) { this.size = size; }

}
