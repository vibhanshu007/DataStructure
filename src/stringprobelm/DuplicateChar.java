package stringprobelm;

import java.util.HashMap;
import java.util.Map;



public class DuplicateChar {

    public static void main(String args[]) {

        String str = "vibhanshu shukla";

        duplicatesCount(str);
    }

    private static void duplicatesCount(String text) {

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (hm.containsKey(c)) {
                int count = hm.get(c);
                hm.put(c, ++count);
            } else {
                hm.put(c, 1);
            }
        }

        // one method to iterate map
        /*Set set = hm.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry) it.next();
            System.out.println(me.getKey() +" : "+ me.getValue());
        }*/

        // second method to iterate map

        for (Map.Entry me : hm.entrySet()) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }

    }

}
