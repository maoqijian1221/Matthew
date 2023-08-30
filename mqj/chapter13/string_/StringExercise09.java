package com.mqj.chapter13.string_;

public class StringExercise09 {
    public static void main(String[] args) {
    	
        String s1 = "hfedu";  //s1 指向池中的 “hfedu”
        String s2 = "java"; // s2 指向池中的 “java”
        String s5 = "hfedujava"; //s5 指向池中的 “hfedujava”
        String s6 = (s1 + s2).intern();//s6 指向池中的   “hfedujava”
        System.out.println(s5 == s6); //T
        System.out.println(s5.equals(s6));//T

    }
}
