package com.bugatti.test;


import org.apache.commons.collections.CollectionUtils;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        // 查询出来的数据
        List<String> oldList = new ArrayList<> ();
        oldList.add ("aa");
        oldList.add ("bb");
        oldList.add ("cc");
        oldList.add ("dd");
        // 新的数据
        String[] newArray = {"aa", "dd", "ff", "ee"};
        List<String> newList = Arrays.asList (newArray);
        //1. 找出旧集合中有的,但是新集合中没有的数据
        Collection subtract = CollectionUtils.subtract (oldList, newList);
        System.out.println (subtract + "旧集合中有的,但是新集合中没有的数据");
        // 2. 找出旧集合 与新集合都有的数据
        Collection intersection = CollectionUtils.intersection (oldList, newList);
        System.out.println (intersection + "旧集合 与新集合都有的数据");
        //3. 找出新集合中有的,但是旧集合中没有的数据
        Collection subtract1 = CollectionUtils.disjunction (newList, intersection);
        System.out.println (subtract1 + "找出新集合中有的,但是旧集合中没有的数据");


    }
}
