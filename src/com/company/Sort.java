package com.company;

import java.util.*;

public class Sort {

    public Sort(ArrayList<String> user3) {
    }

    public static void main(String[] args) {
            List<String> strings = fillList(args);
            Collections.sort(strings, comparator());
            System.out.println(strings);
        }

        private static Comparator<? super String> comparator() {
            return new Comparator<String>() {
                String letter = "d";
                int count(String s) {
                    int count = 0;
                    for (int i = 0; i < s.length(); i++) {
                        if (letter.indexOf(s.charAt(i)) >= 0) {
                            count++;
                        }
                    }
                    return count;
                }


                public int compare(String s1, String s2) {
                    return count(s1) - count(s2);
                }
            };
        }

        private static List<String> fillList(String[] args) {
            return Arrays.asList("gfdd", "yytjkd", "qwddffd", "reyhf");
        }
    }

