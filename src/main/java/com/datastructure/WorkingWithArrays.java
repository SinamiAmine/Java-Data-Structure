package com.datastructure;

import java.util.Arrays;

public class WorkingWithArrays {


    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";


        //Arrays ---> Class
        System.out.println(Arrays.toString(colors));

        //Particuler index
        System.out.println(colors[1]);

        //if index search > lastIndexOfArray  ==>  ArrayIndexOutOfBoundsException


        // Tag1
        int[] numbers = new int[2];
        numbers[0] = 100;
        numbers[1] = 200;

        //instead of (Tag1) we can put this short syntax
        int[] numbersShortSyntax = {100,200};



        for(int i=0;i<colors.length;i++){
            System.out.println(colors[i]);
        }

        //Extraire array inverse
        for(int i=colors.length - 1;i>=0;i--){
            System.out.println(colors[i]);
        }


        //Extraire array
        for(String color : colors){
            System.out.println(color);
        }


        //Extraire array using stream
        Arrays.stream(colors).forEach(System.out::println);





    }



}
