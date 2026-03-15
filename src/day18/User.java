package day18;

import java.io.Serializable;

public  class User{
    private String id;
    private String name;
    private Integer age;

    public User(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("通过有参构造创建对象");
    }

    public User() {
        System.out.println("通过无参构造创建对象");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Override
    public String toString() {
        return  "User{" + '\n'+
                "id="+id+'\n'+
                "name="+name+'\n'+
                "age="+age+'}';
    }
}
