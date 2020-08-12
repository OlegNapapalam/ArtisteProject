import skillsPack.Dancer;
import skillsPack.Musician;
import skillsPack.Vocalist;

public class AcademyOfArts {

    public AcademyOfArts() {
    }

    //Обучаем Человека
    public void toStudyForAnArtiste(Human human) {
        education(human);
    }

    private void education(Human human) {
        int r = (int) (1 + Math.random() * 3);
        switch (r) {
            case 1:
                human.artiste = new Dancer();
                break;
            case 2:
                human.artiste = new Vocalist();
                break;
            case 3:
                human.artiste = new Musician();
                break;
        }
    }

}
