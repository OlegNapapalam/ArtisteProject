import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Human implements Artiste, SelfEducation{
    private String name;
    private int age;

    protected boolean isArtiste = false;
    protected String penName = null;
    protected String skill = null;

    public Human() {
    }

    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName() {
        String name = null;
        while (name == null || name.length() < 2) {
            System.out.print("Введите имя человека: ");
            name = inputArg();
            if (name != null && name.length() >= 2) this.name = name;
            else System.out.println("Ошибка! Имя должно состоять минимум из двух символов. Повторите ввод.");
        }
    }

    public void setName(String name) {
        if (name != null && name.length() >= 2) this.name = name;
        else {
            System.out.println("Ошибка! Имя должно состоять минимум из двух символов. Повторите ввод.");
            while (name == null || name.length() < 2) {
                System.out.print("Введите имя человека: ");
                name = inputArg();
                if (name != null && name.length() >= 2) this.name = name;
                else System.out.println("Ошибка! Имя должно состоять минимум из двух символов. Повторите ввод.");
            }
        }


    }

    public String getAge() {
        int x = age % 10;
        if(x == 0 || x == 5 || x == 6 || x == 7 || x == 8 || x == 9) return age + " лет";
        else if(x == 1) return age + " год";
        else if(x==2 || x==3 || x==4) return age + " года";
        return null;
    }

    public void setAge() {
        int age = 0;
        while (age <= 17) {
            System.out.print("Введите число лет человека: ");
            try {
                age = Integer.parseInt(inputArg());
            } catch (NumberFormatException ignored) {

            }
            if (age > 17) this.age = age;
            else System.out.println("Ошибка! Не допустимое значение! Повторите ввод.");
        }
    }

    public void setAge(int age) {
        if (age > 17){ this.age = age;}
        else { System.out.println("Ошибка! Не допустимое значение! Повторите ввод.");
            while (age <= 17) {
                System.out.print("Введите число лет человека: ");

                try { age = Integer.parseInt(inputArg());
                } catch (NumberFormatException ignored) { }

                if (age > 17) this.age = age;
                else System.out.println("Ошибка! Не допустимое значение! Повторите ввод.");
            }
        }
    }

    public String inputArg() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String buffArg = null;
        try {
            buffArg = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffArg;
    }


    @Override
    public Artiste artiste(boolean isArtiste, String penName, String skill) {
        this.isArtiste = isArtiste;
        this.penName = penName;
        this.skill = skill;
        return null;
    }

    @Override
    public boolean getIsArtiste() {
        return isArtiste;
    }

    @Override
    public String getPenName() {
        return penName;
    }

    @Override
    public String getSkill() {
        return skill;
    }

    @Override
    public String getSelfEducationSkill() {
        final HashMap<String, String> someSkills = new HashMap<String, String>() {{
            put("танцует польку", "танцор");
            put("танцует без ног", "танцор");
            put("поет песню Гордона - про Соловьева", "певец");
            put("поет песню Скрябина - Гондурас", " певец");
            put("играет на гитаре", "музыкант");
            put("играет на барабане ", "музыкант");
        }};
        ArrayList listSkill = new ArrayList<>();
        for (Map.Entry entry:someSkills.entrySet()) {
            listSkill.add(entry.getKey());
        }
        int r = (int) (Math.random() * 5);
        this.skill=someSkills.get((String) listSkill.get(r)) +", "+ (String) (listSkill.get(r));
        return skill;
    }
}