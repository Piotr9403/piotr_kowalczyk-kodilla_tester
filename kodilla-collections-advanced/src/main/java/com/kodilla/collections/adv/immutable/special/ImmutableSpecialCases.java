package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args) {
        Integer a = 112;                 // [1]
        Integer b = 112;                 // [2]
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println("-----");
        String x = "This is string";
        String y = "This is string";
        System.out.println(x == y);
        System.out.println(x.equals(y));
//
    }
}
