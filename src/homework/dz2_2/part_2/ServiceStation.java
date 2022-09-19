package homework.dz2_2.part_2;

public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck, Zhiguli zhiguli) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.updateTyre();
            }
        }else if (zhiguli != null) {
            System.out.println("Обслуживаем " + zhiguli.modelName);
            for (int i = 0; i < zhiguli.wheelsCount; i++) {
                zhiguli.updateTyre();
            }
            zhiguli.checkEngine();
        }
    }
}
