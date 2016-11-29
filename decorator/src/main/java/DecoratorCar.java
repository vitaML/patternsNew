
/**
 * Created by Viktoriia_Martyniuk- on 24-Nov-16.
 */
public class DecoratorCar extends Car{
    private Car decoratedCar;

    public DecoratorCar(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }
    public Car getDecoratedCar() {
        return decoratedCar;
    }

    public void setDecoratedCar(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void go() {
        decoratedCar.go();
    }
}
