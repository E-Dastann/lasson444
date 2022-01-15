package com.company;

import javax.print.MultiDocPrintService;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> sideA = new ArrayList<>();
        ArrayList<String> sideB = new ArrayList<>();
        ArrayList<String> sideC = new ArrayList<>();


        System.out.println();
        for (int i = 0; i < 5; i++) {
            sideA.add(scanner.nextLine());

        }
        System.out.println(sideA);

        for (int i = 0; i < 5; i++) {
            sideB.add(scanner.nextLine());

        }
        System.out.println(sideB);


        Collections.reverse(sideB);

        System.out.println(sideB);
        Integer x=0;
        while (sideC.size()<sideA.size()+sideB.size()){
            sideC.add(sideA.get(x));
            sideC.add(sideB.get(x));
            x++;
        }

        //sideC.add(sideA.get(0));
       // sideC.add(sideA.get(1));


        System.out.println(sideC);
        Collections.sort(sideC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(sideC);


    }
}








