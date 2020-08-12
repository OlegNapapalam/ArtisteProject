package skillsPack;

public class Dancer implements ArtisteInterface {
    private String penName;
    private String skill;

    public Dancer() {
        setSkill();
        setPenName();
    }

    @Override
    public String toString() {
        return "танцор";
    }

    @Override
    public void setSkill() {
        int r = (int) (1 + Math.random() * 2);
        switch (r) {
            case 1:
                this.skill = "танцует польку";
                break;
            case 2:
                this.skill = "танцует брейк";
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
