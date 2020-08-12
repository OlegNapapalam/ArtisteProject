package skillsPack;

public class Musician implements ArtisteInterface {
    private String penName;
    private String skill;

    public Musician(){
        setSkill();
        setPenName();
    }

    @Override
    public String toString() {
        return "музыкант";
    }

    @Override
    public void setSkill() {
        int r = (int) (1 + Math.random() * 2);
        switch (r) {
            case 1:
                this.skill = "играет на гитаре";
                break;
            case 2:
                this.skill = "играет на барабане";
                break;
        }
    }

    @Override
    public String getSkill() {
        return skill;
    }

    @Override
    public void setPenName() {
        do {
            System.out.print("Введите псевдоним: ");
            penName = ArtisteInterface.inputArg();
            if (penName.length() >= 2) this.penName = penName;
            else System.out.println("Ошибка! Псевдоним должен состоять минимум из двух символов. Повторите ввод.");
        } while (penName.length() < 2);
    }

    @Override
    public String getPenName() {
        return penName;
    }

}
