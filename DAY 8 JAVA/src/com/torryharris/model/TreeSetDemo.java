package com.torryharris.model;

import java.util.Collections;
import java.util.TreeSet;
             /* TreeSet is
             binary tree
             sorted
             no duplicates
             */
public interface TreeSetDemo {
    public static void main(String[] args)  {
        TreeSet<Integer> treeSet=new TreeSet<>(Collections.reverseOrder());
        treeSet.add(10);
        treeSet.add(90);
        treeSet.add(7);
        treeSet.add(39);
        treeSet.add(70);
        System.out.println(treeSet);
        TreeSet<String> stringTreeSet=new TreeSet<>();
        stringTreeSet.add("Jp");
        stringTreeSet.add("Ap");
        stringTreeSet.add("Gp");
        stringTreeSet.add("zp");
        System.out.println(stringTreeSet);
        TreeSet<Double> doubleTreeSet=new TreeSet<>();
    }
}
