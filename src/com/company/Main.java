package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] given = {3, 6, 7, 9, 1, 2};
        int[] given2 = {122, 5, 0, 12, 4, 8};
        System.out.println(any(given, given2)); //testing method any()
    }

    static boolean contains(int[] array, int value)
    {
        for (int element : array)
            if (element == value)
                return true;
        return false;
    }

    static boolean any(int[] a, int[] b)
    {
        for (int value : a)
            if ((contains(b, value)))
                return true;
        return false;
    }
}
