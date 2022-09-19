package homework.dz2_2.part_2;

public class Zhiguli extends Transport {
    public String modelName;
    public int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку жигули");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель жигули");
    }
}
