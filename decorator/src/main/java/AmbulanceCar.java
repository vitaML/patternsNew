/**
 * Created by Viktoriia_Martyniuk- on 24-Nov-16.
 */
public class AmbulanceCar extends DecoratorCar {
    public AmbulanceCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void go() {
        super.go();
        System.out.println("urgency : give the way !");
    }

}
