import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface SkillsInterface {

    final HashMap<String, String> someSkills = new HashMap<String, String>() {{
        put("танцует польку", "танцор");
        put("танцует без ног", "танцор");
        put("поет песню Гордона - про Соловьева", "певец");
        put("поет песню Скрябина - Гондурас", " певец");
        put("играет на гитаре", "музыкант");
        put("играет на барабане", "музыкант");
    }};
    ArrayList<Object> listSkill = new ArrayList<>();


    static String setTypeSkill(int r) {
        for (Map.Entry entry : someSkills.entrySet()) {
            listSkill.add(entry.getKey());

        }
        return someSkills.get((String) listSkill.get(r));
    }

    static String setSkill(int r) {
        for (Map.Entry entry : someSkills.entrySet()) {
            listSkill.add(entry.getKey());
        }

        return (String) listSkill.get(r);
    }
}
