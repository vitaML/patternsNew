/**
 * Created by Viktoriia_Martyniuk- on 24-Nov-16.
 */
public class Flat implements Product {
    private String region = "Lviv";
    private int price = 45000;
    private String area = "45";

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void   getProduct() {
        System.out.println(getRegion() + ", " + getPrice() + "$ : " + getArea() + " sqmt");
    }
}
