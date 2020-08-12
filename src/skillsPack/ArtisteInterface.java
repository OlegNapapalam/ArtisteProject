package skillsPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface ArtisteInterface {



    void setSkill();
    String getSkill();
    void setPenName();
    String getPenName();

    static String inputArg() {
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
