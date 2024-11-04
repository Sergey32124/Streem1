package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        int[] mas={1,9,15,300,150,65,100,7,5,55};

        int[] n= Arrays.stream(mas).filter(d->d>100).toArray();

        System.out.println("Массив больше 100 - "+Arrays.toString(n));

    }


}
