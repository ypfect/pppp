package com.example.demo;

import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
@Data
public class Ttest implements Serializable {
    private Integer age;
    private String name;
    private static final long serialVersionUID = 6541746087337988200L;

    public static void main(String[] args) {
        Ttest ttest = new Ttest();

        ttest.age = 99;
        ttest.name = "oj8k";

        List<Ttest> ttests = Collections.singletonList(ttest);
        String s = ttests.stream().map(ttest1 -> ttest1.name).reduce(String::concat).get();
        System.out.println(s);
    }
}
