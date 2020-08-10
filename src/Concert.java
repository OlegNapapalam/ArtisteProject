import java.util.ArrayList;

public class Concert {
    //конструктор Концерта, принимает список Human которые артисты
    //и сразу запускает свои методы
    public Concert(ArrayList<Human> list) {
        //Метод презентации артистов
        presentArtiste(list);
        //Метод Шоу
        makeShow(list);

    }
    private void presentArtiste(ArrayList<Human> list){

        System.out.println("На сцене сегодня выступают: ");
        for(Human human: list){
            System.out.println("Артист которого зовут " + human.getName() +
                    ", ему " + human.getAge() + ", его псевдоним "+ human.getPenName() + "." );
        }


    }
    private void makeShow(ArrayList<Human> list){
            for(Human human: list){
                System.out.println(human.getName() + " что ты умеешь?");
                System.out.println("Отвечает " + human.getName() + ": Я лучший " + human.getTypeSkill() + ".");
                System.out.println("Так сделай это!");
                System.out.println(human.getPenName() + ", " + human.getSkill() + ". ");
                System.out.println(" ");
            }
        System.out.println("Всем спасибо за внимание!");
    }
}
