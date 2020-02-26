package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>(5);//Create a list of strings
        System.out.println("Пожалуйста, введите информацию в List A");
        Scanner s = new Scanner(System.in);
        listA.add(s.nextLine());
        listA.add(s.nextLine());
        listA.add(s.nextLine());
        listA.add(s.nextLine());
        listA.add(s.nextLine());

        Iterator<String> iter = listA.iterator();
        while (iter.hasNext()) {
            String a = iter.next();
            System.out.println(a);
        }
        ArrayList<String> listB = new ArrayList<>(5);
        System.out.println("Пожалуйста, введите информацию в List B");
        listB.add(s.nextLine());
        listB.add(s.nextLine());
        listB.add(s.nextLine());
        listB.add(s.nextLine());
        listB.add(s.nextLine());
        iter = listB.iterator();

        while (iter.hasNext()) {
            String b = iter.next();
            System.out.println(b);
        }
        ArrayList<String> listC = new ArrayList<>(10);
        System.out.println(" \n   Сортировать новый список С из списка А и В: ");
        Collections.reverse(listB);

        for (int i = 0; i < listB.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
            iter = listC.iterator(); }

        while (iter.hasNext()) {
            String c = iter.next();
            System.out.println(c); }

        Collections.addAll(listC);
        System.out.println("Список С после сортировки по длине");
        Collections.sort(listC, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.length() - o2.length();
                    }
                }
        );

        iter = listC.iterator();
        while (iter.hasNext()) {
            String c2=iter.next();
            System.out.println(c2);
        }
    }
}
