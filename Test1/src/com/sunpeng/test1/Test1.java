package com.sunpeng.test1;


import com.sunpeng.test1.model.Person;
import org.junit.Before;
import org.junit.Test;

public class Test1 {

    private Person person = new Person();

    @Before
    public void init(){
        person.setAge(10);
        person.setName("sunpeng");
    }

    @Test
    public void objectToString(){
        System.out.println(person.toString());
    }

    public void objectToJson(){
    }

    public void stringToObject(){

    }
}
