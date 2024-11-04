package org.example.dz1;

import java.util.Arrays;

public class Dz1 {
    public static void main(String[] args) {
        int[] mas={1,9,15,300,150,65,100,7,5,55};

        int[] n= Arrays.stream(mas).filter(d->d>100).toArray();

      //  System.out.println("Массив больше 100 - "+Arrays.toString(n));

        Arrays.stream(n).forEach(num -> System.out.print(num + " "));//вывод числами
    }

}
