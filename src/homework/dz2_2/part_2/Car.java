package homework.dz2_2.part_2;

public class Car extends Transport {
    public String modelName;
    public int wheelsCount;

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку автомобиля");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }
}
