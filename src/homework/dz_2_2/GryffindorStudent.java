package homework.dz_2_2;

public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void compareGryffindor(GryffindorStudent gryffindorStudent) {
        int ability1 = ability();
        int ability2 = gryffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Студент Гриффиндора " + getName() + " лучше, чем " + gryffindorStudent.getName() +
                    " : " + ability1 + "  против " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Студент Гриффиндора " + gryffindorStudent.getName() + " лучше, чем " + getName() +
                    " : " + ability2 + "  против " + ability1);
        } else {
            System.out.println("Студент Гриффиндора " + gryffindorStudent.getName() + " такой же, как и студент Гриффиндора " + getName() +
                    " : " + ability1 + "  против " + ability2);
        }
    }

    private int ability() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return String.format("%s; благородство =  %d, честь = %d, храбрость = %d", super.toString(), nobility, honor, bravery);
    }

}
