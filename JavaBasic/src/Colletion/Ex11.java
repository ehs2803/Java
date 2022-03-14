package Colletion;

import java.util.TreeSet;

public class Ex11 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to	= "d";

        set.add("abc");      set.add("alien");    set.add("bat");
        set.add("car");      set.add("Car");      set.add("disc");
        set.add("dance");    set.add("dZZZZ");    set.add("dzzzz");
        set.add("elephant"); set.add("elevator"); set.add("fan");
        set.add("flower");

        System.out.println(set);
        System.out.println("range search : from " + from  +" to "+ to);
        System.out.println("result1 : " + set.subSet(from, to));
        System.out.println("result2 : " + set.subSet(from, to + "zzz"));

        ////////////////////

        TreeSet set2 = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for(int i=0; i < score.length; i++)
            set2.add(new Integer(score[i]));

        System.out.println("50보다 작은 값 :" + set2.headSet(new Integer(50)));
        System.out.println("50보다 큰 값 :"  + set2.tailSet(new Integer(50)));
    }

}
