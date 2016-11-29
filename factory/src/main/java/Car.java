/**
 * Created by Viktoriia_Martyniuk- on 24-Nov-16.
 */
public class Car implements Product {
    private String name = "Ford";
    private int price = 14000;
    private String engine = "1.6";

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void   getProduct() {
        System.out.println(getName() + ", " + getPrice() + "$ : " + getEngine() + " l");
    }
}
