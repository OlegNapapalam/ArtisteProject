import java.util.ArrayList;

public class Concert {
    public Concert(ArrayList<Human> list) {
        presentArtiste(list);
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
                System.out.println("Отвечает " + human.getName() + ": Все знают что " +
                        human.getName() + " лучший " + human.skill + ".");
                System.out.println("Так сделай это!");
                System.out.println(human.penName + ", " + human.skill + ". ");
                System.out.println(" ");
            }
        System.out.println("Всем спасибо за внимание!");
    }
}
