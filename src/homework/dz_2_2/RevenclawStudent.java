package homework.dz_2_2;

public class RevenclawStudent extends HogwartsStudent {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public RevenclawStudent(String name, int magic, int transgression, int intelligence, int wisdom, int wit, int i) {
        super(name, magic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void compareRevenclaw(RevenclawStudent revenclawStudent) {
        int ability1 = ability();
        int ability2 = revenclawStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Студент Когтеврана " + getName() + " лучше, чем " + revenclawStudent.getName() +
                    " : " + ability1 + "  против " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Студент Когтеврана " + revenclawStudent.getName() + " лучше, чем " + getName() +
                    " : " + ability2 + "  против " + ability1);
        } else {
            System.out.println("Студент Когтеврана " + revenclawStudent.getName() + " такой же, как и студент Когтеврана " + getName() +
                    " : " + ability1 + "  против " + ability2);
        }
    }

    private int ability() {
        return intelligence + wisdom + wit + creativity;
    }

    @Override
    public String toString() {
        return String.format("%s; ум =  %d, мудрость = %d, остроумие = %d, творчество = %d", super.toString(), intelligence, wit, wisdom, creativity);
    }
}
