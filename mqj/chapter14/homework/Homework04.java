package com.mqj.chapter14.homework;

import com.mqj.chapter14.map_.TreeMap_;

import java.util.TreeMap;
import java.util.TreeSet;

@SuppressWarnings({"all"})
public class Homework04 {
    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();
        treeSet.add("hsp");
        treeSet.add("tom");
        treeSet.add("king");
        treeSet.add("hsp");//加入不了
        System.out.println(treeSet);

    }
}
