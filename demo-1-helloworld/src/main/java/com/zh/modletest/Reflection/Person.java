package com.zh.modletest.Reflection;

import lombok.Data;

@Sex(value = "lllll",gender= Sex.Gender.BOY)
@Data
public class Person {
    private String name;
    private Integer age;

}
