package homework.dz_2_2;

public class HufflepuffStudent extends HogwartsStudent {
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void compareHupplepuff(HufflepuffStudent hufflepuffStudent) {
        int ability1 = ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Студент Пуффендуя " + getName() + " лучше, чем " + hufflepuffStudent.getName() +
                    " : " + ability1 + "  против " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Студент Пуффендуя " + hufflepuffStudent.getName() + " лучше, чем " + getName() +
                    " : " + ability2 + "  против " + ability1);
        } else {
            System.out.println("Студент Пуффендуя " + hufflepuffStudent.getName() + " такой же, как и студент Пуффендуя " + getName() +
                    " : " + ability1 + "  против " + ability2);
        }
    }

    private int ability() {
        return diligence + loyalty + honesty;
    }

    @Override
    public String toString() {
        return String.format("%s; усердие =  %d, верность = %d, честность = %d", super.toString(), diligence, loyalty, honesty);
    }

}
