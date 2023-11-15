package com.people.zad1;

class Person {

    private String name;

    private static int counter;

    {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
