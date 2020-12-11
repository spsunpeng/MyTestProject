package com.my.test1;

import com.my.model.person;

import java.util.HashSet;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {

        Set<person> people = new HashSet<>();
        people.add(new person("xiaoming", 18, 20));

        people.add(new person("xiaoming", 19, 21));
        people.add(new person("xiaohong", 18, 22));
        people.add(new person("lisi", 20, 20));

        people.add(new person("xiaoming", 18, 20));


        System.out.println(people);
    }


}
