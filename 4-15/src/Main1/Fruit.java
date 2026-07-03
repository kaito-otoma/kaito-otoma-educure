package Main1;

public class Fruit {
    private String name;
    private int price;
    
    public void setData(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public void displayInfo() {
        String fruitName = (String) name;
        int fruitPrice = (Integer) price;
        System.out.println("果物: " + fruitName);
        System.out.println("価格: " + fruitPrice + "円");
    }
}
