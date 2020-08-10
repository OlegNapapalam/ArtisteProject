import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//интерфейс Artiste, для того чтобы экземпляр класса Human смог стать Артистом
//интерфейс SkillsInterface, для чтобы экземпляр класса Human смог получить навык без "захода" в Академию (стать самоучкой)
public class Human implements Artiste, SkillsInterface{
    private String name;
    private int age;

    //если isArtiste = false значит человек не артист
    //значие true присваеваться только в академии
    //если значение true тогда человек Артист
    private boolean isArtiste = false;
    //Псевдоним который присваеваться только в академии
    private String penName = null;
    //Конкретный навык и тип навыка можно получить из академии если человек проходит обучение
    //так и экземпляр класса Human может использовать методы интерфейса SkillsInterface и самообразоватся
    private String skill = null;
    private String typeSkill = null;

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
            setName();
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
            setAge();
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
    //метод для самообразования (получения навыков без посещение Академии)
    public void selfEducation(){
        int r = (int) (Math.random() * 5);
        this.skill = SkillsInterface.setSkill(r);
        this.typeSkill = SkillsInterface.setTypeSkill(r);
    }

    @Override
    //метод типа Artiste вызываеться только в академии где получает все необходимые значения для артиста
    //и присваивает их экземпляру класса Human
    public Artiste artiste(boolean isArtiste, String penName, String skill, String typeSkill) {
        this.isArtiste = isArtiste;
        this.penName = penName;
        this.skill = skill;
        this.typeSkill = typeSkill;
        return null;
    }
    //гетэры для доступа к значения необходимых для Артиста
    //все эти переменные private чтобы их нельзя было изменить без вызова предведущего метода и без посещения академии
    //или же в случаее если человек самоучка, он может вызвать метод selfEducation в качестве сетера для значений навыков
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
    public String getTypeSkill() {
        return typeSkill;
    }

}