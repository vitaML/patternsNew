/**
 * Created by Viktoriia_Martyniuk- on 24-Nov-16.
 */
public class Car {
    protected String name;

    public void go() {
        System.out.println("I'm " + name + ". Let's go.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
