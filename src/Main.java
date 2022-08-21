import java.util.HashMap;
import java.util.Map;

public class Main {


    public static String sampleText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < sampleText.length(); i++) {
            char c = sampleText.charAt(i);
            if(map.containsKey(c)) {
                int n = map.get(c) + 1;
                map.put(c, n);
            } else {
                map.put(c, 1);
            }

        }

        int max = -1;
        char cMax = '\u0000';

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            //System.out.println(entry.getKey() + " = " + entry.getValue());
            if(entry.getValue() > max) {
                max = entry.getValue();
                cMax = entry.getKey();
            }
        }
        System.out.println("Чаще всего встречается символ: " + cMax + " (" + max + " раз)");

        int min = Integer.MAX_VALUE;
        char cMin = '\u0000';

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() < min) {
                min = entry.getValue();
                cMin = entry.getKey();
            }
        }
        System.out.println("Реже всего встречается символ: " + cMin + " (" + min + " раз)");
    }
}

