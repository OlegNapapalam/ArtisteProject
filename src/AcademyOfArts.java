
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AcademyOfArts {

    public AcademyOfArts() {
    }

    // ХешМап всех скилов, по принципу: ключ - уникальное значение навыка
    //                                  значение - тип навыка
    private static final HashMap<String, String> someSkills = new HashMap<String, String>() {{
        put("танцует польку", "танцор");
        put("танцует без ног", "танцор");
        put("поет песню Гордона - про Соловьева", "певец");
        put("поет песню Скрябина - Гондурас", " певец");
        put("играет на гитаре", "музыкант");
        put("играет на барабане ", "музыкант");
    }};

    //Обучаем Человека
    void toStudyForAnArtiste(Human human) {
        //для удобства все нужные переменые передаем Человеку
        //через метод интерфейса Артист
        human.artiste(true, givePenName(), giveEducation());
    }

    //Даем скил Человку-Артисту
    // Сделал через свитч, потом понял скольно нужно дописывать если навыков например 150
    // и переделал с листом.
    public String giveEducation() {
        ArrayList listSkill = new ArrayList<>();
        for (Map.Entry entry : someSkills.entrySet()) {
            listSkill.add(entry.getKey());
        }
        int r = (int) (Math.random() * 5);

        return someSkills.get((String) listSkill.get(r)) + ", " + (String) (listSkill.get(r));
    }

    String givePenName() {
        String penName = null;
        while (penName == null || penName.length() < 2) {
            System.out.print("Введите псевдоним для вашего артиста: ");
            ;
            penName = inputPenName();
            if (penName != null && penName.length() >= 2) break;
            else System.out.println("Ошибка! Пвсевдоним должен состоять минимум из двух символов. Повторите ввод.");
        }
        return penName;
    }

    public static String inputPenName() {
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
