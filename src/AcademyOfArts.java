
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcademyOfArts implements SkillsInterface {

    public AcademyOfArts() {
    }

    //Обучаем Человека
    public void toStudyForAnArtiste(Human human) {
        int r = (int) (Math.random() * 5);
        human.artiste(true, setPenName(), SkillsInterface.setSkill(r), SkillsInterface.setTypeSkill(r));
    }

    private String setPenName() {
        String penName = null;
        while (penName == null || penName.length() < 2) {
            System.out.print("Введите псевдоним для вашего артиста: ");
            penName = inputPenName();
            if (penName != null && penName.length() >= 2) break;
            else System.out.println("Ошибка! Пвсевдоним должен состоять минимум из двух символов. Повторите ввод.");
        }
        return penName;
    }

    private static String inputPenName() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String buffArg = null;
        try {
            buffArg = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffArg;
    }

}
