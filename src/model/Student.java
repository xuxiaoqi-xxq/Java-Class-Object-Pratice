package model;

public class Student {

    private String name;

    private int age;

    private String gender;

    private String id;

    public Student(){}

    public Student(String name, int age, String gender, String id){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }
}
