package taxOffice;

import java.util.*;

public class Sitizen {
    private String fio;
    private int count;
    private int age;
    private ArrayList<Sitizen> children;
    Sitizen(String fio, int age) throws Exception{
        if(age<0)
            throw new Exception("Invalid data!");
        this.fio = fio;
        this.age = age;
        count = 0;
        children = new ArrayList<>();
    }
    String getFio(){
        return this.fio;
    }
    int getAge(){
        return this.age;
    }
    void setAge(int age){
        if (age>0)
            this.age = age;
    }
    int getCount(){
        return this.count;
    }
    void AddChildren(Sitizen a){
        count++;
        this.children.add(a);
    }
    Sitizen getChildren(int i){
        return children.get(i);
    }

}
