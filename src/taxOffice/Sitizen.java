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
        this.age = age;
    }

//    private int children;
//    Sitizen(String fio, int children) throws Exception{
//        if(children<0){
//            throw new Exception("Недопустимые данные!");
//        }
//        this.children = children;
//        this.fio = fio;
//    }
}
