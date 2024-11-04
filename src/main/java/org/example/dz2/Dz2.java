package org.example.dz2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Dz2 {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer>rand= random.ints(100,1,1000)
                        .boxed().collect(Collectors.toList());

        int sum = rand.stream().mapToInt(Integer::intValue).sum();

       // System.out.println("Список случайных чисел: " + rand);
        rand.stream().forEach(f-> System.out.println(f));
        System.out.println("Сумма чисел: " + sum);
    }
}
