package homework.dz_2_2;

public abstract class HogwartsStudent {
    private String name;
    private int magic;
    private int transgression;

    public HogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void print() {
        System.out.println(this);
    }

    private int ability() {
        return magic + transgression;
    }

    public void compareHogwarts(HogwartsStudent hogwartsStudent) {
        int ability1 = ability();
        int ability2 = hogwartsStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Студент " + getName() + " лучше, чем " + hogwartsStudent.getName() +
                    " : " + ability1 + "  против " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Студент " + hogwartsStudent.getName() + " лучше, чем " + getName() +
                    " : " + ability2 + "  против " + ability1);
        } else {
            System.out.println("Студент " + hogwartsStudent.getName() + " такой же, как и студент " + getName() +
                    " : " + ability1 + "  против " + ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("Студент " + name + ", уровень магии = " + magic +
                ", уровень трансгрессии = " + transgression);
    }
}
