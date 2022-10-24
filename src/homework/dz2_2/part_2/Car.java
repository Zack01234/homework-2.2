package homework.dz2_2.part_2;

public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void repair() {
        System.out.println("Обслуживаем " + this.modelName);
        this.updateTyre();
        checkEngine();
    }
}
