/**
 * Created by Viktoriia_Martyniuk- on 29-Nov-16.
 */
public class FlatItem implements MainItem{
    public String item = "flat";
    public String action = "";

    public void operation() {
        System.out.println("create flat");
        action = item;
    }
}
