package cn.gson.oasys.model.entity;

public class Cai {


    private String name;

    private int age;

    public Cai() {
    }

    public Cai(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
