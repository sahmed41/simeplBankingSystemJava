package OneSystem;

// Importing Java Packages
import java.util.HashMap;

public class Output {
    public static String outputJson(HashMap<String, String> information) {
        String jsonOutPut = "{";
        int counter = 1;
        for (String i : information.keySet()) {
            jsonOutPut += i + ": " + information.get(i);
            if (counter != information.size()) {
                jsonOutPut += ", ";
            }
            counter++;
        }
        jsonOutPut += "}";
        return jsonOutPut;
    }

    public static String outputCsv(HashMap<String, String> information) {
        String csvTitle = "";
        String csvValue = "";
        int counter = 1;
        for (String i : information.keySet()) {
            csvTitle += i;
            if (counter != information.size()) {
                csvTitle += ", ";
            }
            counter++;
        }
        counter = 0;
        for (String i : information.values()) {
            csvValue += i;
            if (counter != information.size()) {
                csvValue += ", ";
            }
            counter++;
        }
        
        return csvTitle + "\n" + csvValue;
    }
}
