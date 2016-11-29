/**
 * Created by Viktoriia_Martyniuk- on 24-Nov-16.
 */
public class Main {
    public static void main(String[] args) {
        Car doctors = new AmbulanceCar(new FordCar());
        doctors.go();
    }
}
