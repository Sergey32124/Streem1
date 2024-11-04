package org.example.dz3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Dz3 {
    public static void main(String[] args) {
        List<User> u = new ArrayList<>();
        u.add(new User(25, "Mikel", 20000));
        u.add(new User(45, "Oleg", 10000));
        u.add(new User(35, "Fedy", 15000));
        u.add(new User(18, "Dima", 200000));
        u.add(new User(22, "Nikita", 150000));
        u.add(new User(19, "Georgiy", 45000));

        // Создаем новый список с увеличенными зарплатами
        List<User> k = u.stream()
                .map(user -> {
                    user.setSallary(user.getSallary() + 10000);
                    return user;
                })
                .collect(Collectors.toList());

        // Выводим результаты
        k.stream().forEach(user -> System.out.println(user.getYear()+" "+user.getName() + " " + user.getSallary()));
    }
}