package Colletion;

import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set); // LinkedList(Collection c)
        Collections.sort(list);          // Collections.sort(List list)
        System.out.println(list);

        Set set2 = new TreeSet();

        for (int i = 0; set2.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set2.add(num);  // set.add(new Integer(num));
        }

        System.out.println(set2);
    }
}
