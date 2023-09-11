
    // Имплементация метода "заправка топливом" интерфейса "Заправочная станция" в классе "Car"
    public class Car implements FuelingStation {
        @Override
        public void refuel() {
            System.out.println("Заправка топливом");
        }

        @Override
        public void cleanWindshield() {
            System.out.println("Протирка лобового стекла");
        }

        @Override
        public void cleanHeadlights() {
            System.out.println("Протирка фар");
        }

        @Override
        public void cleanMirrors() {
            System.out.println("Протирка зеркал");
        }
    }


    public class Car implements FuelingStation, ChargingStation, MaintenanceStation {
        // Реализация методов интерфейса FuelingStation
        @Override
        public void refuel() {
            System.out.println("Заправка топливом");
        }

        @Override
        public void cleanWindshield() {
            System.out.println("Протирка лобового стекла");
        }

        @Override
        public void cleanHeadlights() {
            System.out.println("Протирка фар");
        }

        @Override
        public void cleanMirrors() {
            System.out.println("Протирка зеркал");
        }

        // Реализация методов интерфейса ChargingStation
        @Override
        public void charge() {
            System.out.println("Зарядка");
        }

        // Реализация методов интерфейса MaintenanceStation
        @Override
        public void maintenance() {
            System.out.println("Техническое обслуживание");
        }
    }



