package com.datastructure;

import java.util.ArrayList;
import java.util.List;

public class WorkingWihLists {
    public static void main(String[] args) {
        //For List we have multiple implementation
        //new ArrayList n new Set , new HashMap
        List colors = new ArrayList();
        colors.add("blue");
        colors.add("purple");
    /*    colors.add(1);
        colors.add(new Object());*/

        //on peur spécifier le type du lisy
        System.out.println(colors.size());
        System.out.println(colors.contains("blue"));
        System.out.println(colors.contains("pink"));
        System.out.println(colors);
    }
}
