package skillsPack;

public class SelfMade implements ArtisteInterface {
    String skill;

    public SelfMade() {
        setSkill();
    }

    @Override
    public String toString() {
        return "самоучка";
    }


    @Override
    public void setSkill() {
        int r = (int) (1 + Math.random() * 6);
        switch (r) {
            case 1:
                this.skill = "танцует польку";
                break;
            case 2:
                this.skill = "танцует брейк";
                break;
            case 3:
                this.skill = "играет на гитаре";
                break;
            case 4:
                this.skill = "играет на барабане";
                break;
            case 5:
                this.skill = "поет шансон";
                break;
            case 6:
                this.skill = "поет реп";
                break;
        }
    }

    @Override
    public String getSkill() {
        return skill;
    }

    @Override
    public void setPenName() {

    }

    @Override
    public String getPenName() {
        return null;
    }

}