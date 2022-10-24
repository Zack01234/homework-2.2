package homework.dz2_2.part_2;

public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void repair() {
        System.out.println("Обслуживаем " + this.modelName);
        this.updateTyre();
        checkEngine();
        checkTrailer();
    }
}
