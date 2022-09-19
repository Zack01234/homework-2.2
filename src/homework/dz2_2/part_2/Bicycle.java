package homework.dz2_2.part_2;

public class Bicycle extends Transport {
    public String modelName;
    public int wheelsCount;

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }

    @Override
    public void service() {
        updateTyre();
    }


}
