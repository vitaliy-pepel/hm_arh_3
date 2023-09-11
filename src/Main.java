// Проверка принципа LSP
public class Main {
    public static void main(String[] args) {
        Car.Car car = new Car.Car();
        car.movement(); // Вывод: "Движение на автомобиле"

        Car.Car flyingCar = new Car.FlyingCar();
        flyingCar.movement(); // Вывод: "Полёт на автомобиле"
    }
}

// Проверка принципа ISP
public class Main {
    public static void main(String[] args) {
        Car.Car car = new Car.Car();
        car.refuel(); // Вывод: "Заправка топливом"
        car.cleanWindshield(); // Вывод: "Протирка лобового стекла"
        car.cleanHeadlights(); // Вывод: "Протирка фар"
        car.cleanMirrors(); // Вывод: "Протирка зеркал"

        Car.Car electricCar = new ElectricCar();
        electricCar.charge(); // Вывод: "Зарядка"
    }
}

// Проверка принципа DIP
public class Main {
    public static void main(String[] args) {
        Car.GasolineCar gasolineCar = new Car.GasolineCar();
        gasolineCar.refuel(); // Вывод: "Заправка бензином"

        Car.DieselCar dieselCar = new Car.DieselCar();
        dieselCar.refuel(); // Вывод: "Заправка дизельным топливом"
    }
}