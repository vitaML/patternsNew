/**
 * Created by Viktoriia_Martyniuk- on 29-Nov-16.
 */
public class CloseItem implements MainItem {
    public String item = "close";

    public void operation() {
        System.out.println("close");
        System.exit(0);
    }
}
