package homework.dz_2_2;

public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public void compareSlytherin(SlytherinStudent slytherinStudent) {
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Студент Слизерина " + getName() + " лучше, чем " + slytherinStudent.getName() +
                    " : " + ability1 + "  против " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Студент Слизерина " + slytherinStudent.getName() + " лучше, чем " + getName() +
                    " : " + ability2 + "  против " + ability1);
        } else {
            System.out.println("Студент Слизерина " + slytherinStudent.getName() + " такой же, как и студент Слизерина " + getName() +
                    " : " + ability1 + "  против " + ability2);
        }
    }

    private int ability() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    @Override
    public String toString() {
        return String.format("%s; хитрость =  %d, решительность = %d, амбициозность = %d, находчивость = %d, жажда власти =  %d", super.toString(), cunning, determination, ambition, resourcefulness, thirstForPower);
    }
}
