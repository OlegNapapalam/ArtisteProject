import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//одна статика, не требует переопредиления, подключил и вызываешь
public interface SkillsInterface {

    //конкретный навык это уникальный ключ, тип навыка это значение
    final HashMap<String, String> someSkills = new HashMap<String, String>() {{
        put("танцует польку", "танцор");
        put("танцует без ног", "танцор");
        put("поет песню Гордона - про Соловьева", "певец");
        put("поет песню Скрябина - Гондурас", " певец");
        put("играет на гитаре", "музыкант");
        put("играет на барабане", "музыкант");
    }};
    //лист в кором будут все значения Мар что сверху
    ArrayList<Object> listSkill = new ArrayList<>();

    //возвращаем тип навыка из листа с индексом r
    //r получает рандомное значение в методе ОбучитьАртиста класса Академия
    static String setTypeSkill(int r) {
        for (Map.Entry entry : someSkills.entrySet()) {
            listSkill.add(entry.getKey());

        }
        return someSkills.get((String) listSkill.get(r));
    }

    //возвращаем конкретный навык из листа с индексом r
    //r получает рандомное значение в методе ОбучитьАртиста класса Академия
    static String setSkill(int r) {
        for (Map.Entry entry : someSkills.entrySet()) {
            listSkill.add(entry.getKey());
        }

        return (String) listSkill.get(r);
    }
}
