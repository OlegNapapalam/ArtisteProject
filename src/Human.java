import skillsPack.ArtisteInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//интерфейс Artiste, для того чтобы экземпляр класса Human смог стать Артистом
//интерфейс SkillsInterface, для чтобы экземпляр класса Human смог получить навык без "захода" в Академию (стать самоучкой)
public class Human {
    private String name;
    private int age;

    public ArtisteInterface artiste;

    //только конструктор с параметрами для того чтобы человек не мог быть без имени и возвраста
    public Human(String name, int age) {
        //сетеры с параметрами для их проверки
        //если параметры неподходящие внутри сетеров с параметрами вызываються сетеры без параметров
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName() {
        do {
            System.out.print("Введите имя человека: ");
            name = inputArg();
            if (name != null && name.length() >= 2) this.name = name;
            else System.out.println("Ошибка! Имя должно состоять минимум из двух символов. Повторите ввод.");
        } while (name == null || name.length() < 2);
    }

    public void setName(String name) {
        if (name != null && name.length() >= 2) this.name = name;
        else {
            setName();
        }
    }

    public String getAge() {
        int x = age % 10;
        if (x == 0 || x == 5 || x == 6 || x == 7 || x == 8 || x == 9) return age + " лет";
        else if (x == 1) return age + " год";
        else if (x == 2 || x == 3 || x == 4) return age + " года";
        return null;
    }

    public void setAge() {
        do {
            System.out.print("Введите число лет человека: ");
            try { age = Integer.parseInt(inputArg());
            } catch (NumberFormatException ignored){}
            if (age > 17) this.age = age;
            else System.out.println("Ошибка! Не допустимое значение! Повторите ввод.");
        } while (age <= 17);
    }

    public void setAge(int age) {
        if (age > 17) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Не допустимое значение! Повторите ввод.");
            setAge();
        }
    }

    private String inputArg() {
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