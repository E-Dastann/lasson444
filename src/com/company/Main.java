package com.company;

import javax.print.MultiDocPrintService;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> user = new ArrayList<>();
        user.add(scanner.nextLine());
        user.add("канат");
        user.add("арстан");
        user.add("кажарбек");
        user.add("нурисам");
        System.out.println(user);
        while (user.size() <= 4) {
            String NameUser = scanner.nextLine();
            user.add(NameUser);
            System.out.println(NameUser);


        }

        ArrayList<String> user2 = new ArrayList<>();
        user2.add("нурай");
        user2.add("нуржан");
        user2.add("Айдай");
        user2.add("Жанар");
        user2.add("гулмайрам");
        user2.add("нуржан");
        System.out.println(user2);


        ArrayList<String> user3 = new ArrayList();
        user3.addAll(user);
        user3.addAll(user2);


    }
    }
