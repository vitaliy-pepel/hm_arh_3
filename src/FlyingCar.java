// Переопределение метода "движение" - "полёт" для конкретного автомобиля
public class FlyingCar extends Car {
    @Override
    public void movement() {
        System.out.println("Полёт на автомобиле");
    }
}