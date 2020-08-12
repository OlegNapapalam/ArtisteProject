import skillsPack.Dancer;
import skillsPack.Musician;
import skillsPack.SelfMade;
import skillsPack.Vocalist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Создадим наших людей!");
        //создаем экземляры класса Human, и сразу передаем необходимые конструктору значения с помощью методов ввода
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
        NotArtisteHasSkill.artiste = new SelfMade();

        System.out.println("Человек с именем - " + NotArtisteHasSkill.getName() + ", " +
                NotArtisteHasSkill.artiste.toString() + ". Его навык: " + NotArtisteHasSkill.artiste.getSkill() + ".");

        //колекция людей которые пойдуть становиться артистами в академию
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


        System.out.println("Созданые люди идут учиться навыкам в академию");
        System.out.println("Кроме самоучки, ему нечего там делать");
        //создаем экземпляр класса АкадемияИскуств, где Люди будут проходить обучение
        AcademyOfArts someAcademyOfArts = new AcademyOfArts();
        for (Human human : list) {
            System.out.println("Человек по имени " + human.getName() + " проходит обучение.");

            //Делаем Человека Артистом
            someAcademyOfArts.toStudyForAnArtiste(human);
        }

        //Лист Артистов
        ArrayList<Human> artisteList = new ArrayList<Human>();
        //Лист самообразованых
        ArrayList<Human> selfEducationList = new ArrayList<Human>();

        for (Human human : list) {
            if (human.artiste instanceof Dancer ||
                    human.artiste instanceof Musician ||
                    human.artiste instanceof Vocalist)
                artisteList.add(human);
            else if (human.artiste instanceof SelfMade) selfEducationList.add(human);
        }

        Concert concert;
        //Концерт принимает лист всех артистов
        //И в конструкторе вызывает методы Представления и Шоу
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
