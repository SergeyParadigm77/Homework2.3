public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("bicycle1");
        Bicycle bicycle2 = new Bicycle("bicycle2");
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        ServiceStation station  = new ServiceStation();

        System.out.println("Диагностика велосипеда 1: ");
        station.check(bicycle);
        System.out.println();
        System.out.println("Диагностика велосипеда 2: ");
        station.check(bicycle2);

        System.out.println("*************************************");

        System.out.println("Диагностика легкового автомобиля 1: ");
        station.check(car);
        System.out.println();
        System.out.println("Диагностика легкового автомобиля 2: ");
        station.check(car2);

        System.out.println("*************************************");

        System.out.println("Диагностика грузовых автомобиля 1: ");
        station.check(truck);
        System.out.println();
        System.out.println("Диагностика грузовых автомобиля 2: ");
        station.check(truck2);
    }
}