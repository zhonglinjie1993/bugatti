package com.bugatti.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

/*
        String waibu = "lambda :";
        List<String> proStrs = Arrays.asList (new String[]{"Ni", "Hao", "Lambda"});



        List<String> collect = proStrs.stream ().map (aa -> {
            long l = System.currentTimeMillis ();
            return waibu + "---" + aa + "*******" + l;


        }).collect (Collectors.toList ());

        collect.forEach (System.out::println);*/


        Stream<Double> generate = Stream.generate (() -> Math.random ());
        System.out.println (generate.limit (2));
    }

    static class Person {
        String name;
        Integer age;
        List<String> tags;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public Person(String name, Integer age, List<String> tags) {
            this.name = name;
            this.age = age;
            this.tags = tags;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", tags=" + tags +
                    '}';
        }
    }
}
