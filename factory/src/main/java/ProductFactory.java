import java.util.Map;

/**
 * Created by Viktoriia_Martyniuk- on 24-Nov-16.
 */
public class ProductFactory {
    public static void main(String[] args) throws NoSuchFieldException {
        StrategyMain strategy = new StrategyMain();
        Map.Entry<String, MainItem> itemMenu = strategy.chose();
        Product product = null;
        if (itemMenu.getKey().equals("flat")) {
            product = new Flat();
        }
        if (itemMenu.getKey().equals("car")) {
            product = new Car();
        }
        product.getProduct();
    }
}
