import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Создадим наших людей!");
        Human SomeHumanObject_1 = new Human(inputName(), inputAge());
        Human SomeHumanObject_2 = new Human(inputName(), inputAge());
        Human SomeHumanObject_3 = new Human(inputName(), inputAge());
        Human SomeHumanObject_4 = new Human(inputName(), inputAge());
        Human SomeHumanObject_5 = new Human(inputName(), inputAge());
//        Human SomeHumanObject_6 = new Human(inputName(),inputAge());
//        Human SomeHumanObject_7 = new Human(inputName(),inputAge());
//        Human SomeHumanObject_8 = new Human(inputName(),inputAge());
//        Human SomeHumanObject_9 = new Human(inputName(),inputAge());
//        Human SomeHumanObject_10 = new Human(inputName(),inputAge());

        System.out.println("Добавим человека самоучку");
        Human NotArtisteHasSkill = new Human(inputName(), inputAge());

        NotArtisteHasSkill.selfEducation();
        System.out.println("Человек с именем - " + NotArtisteHasSkill.getName() + ", артист? " +
                NotArtisteHasSkill.getIsArtiste() + ". Его навык: " + NotArtisteHasSkill.getSkill() + ".");


        ArrayList<Human> list = new ArrayList<Human>();
        list.add(SomeHumanObject_1);
        list.add(SomeHumanObject_2);
        list.add(SomeHumanObject_3);
        list.add(SomeHumanObject_4);
        list.add(SomeHumanObject_5);

//        list.add(SomeHumanObject_6);
//        list.add(SomeHumanObject_7);
//        list.add(SomeHumanObject_8);
//        list.add(SomeHumanObject_9);
//        list.add(SomeHumanObject_10);


//
//        for (Human human : list){
//            System.out.println(human.getName());
//            System.out.println(human.getAge());
//        }

        System.out.println("Созданые люди идут учиться навыкам в академию");
        System.out.println("Кроме самоучки, ему нечего там делать");
        AcademyOfArts someAcademyOfArts = new AcademyOfArts();
        for (Human human : list) {
            System.out.println("Человек по имени " + human.getName() + " проходит обучение.");
            someAcademyOfArts.toStudyForAnArtiste(human);
        }

        ArrayList<Human> artisteList = new ArrayList<Human>();
        ArrayList<Human> selfEducationList = new ArrayList<Human>();
        for (Human human : list) {
            if (human.getIsArtiste()) artisteList.add(human);
            else if (human.getIsArtiste() && human.getSkill() != null) selfEducationList.add(human);
        }

        Concert concert;
        new Concert(artisteList);

    }


    public static String inputName() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String buffArg = null;
        try {
            System.out.print("Введите имя создаваемого человека: ");
            buffArg = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffArg;
    }

    public static int inputAge() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int buffArg = 0;
        try {
            System.out.print("Введите число лет создаваемого человека: ");
            buffArg = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException ignored) {
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buffArg;
    }


}
