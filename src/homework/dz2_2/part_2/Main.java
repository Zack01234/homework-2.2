package homework.dz2_2.part_2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        Zhiguli zhiguli = new Zhiguli("zhiguli", 4);

        car.repair();
        car2.repair();
        bicycle.repair();
        bicycle2.repair();
        truck.repair();
        truck2.repair();
        zhiguli.repair();
    }
}
