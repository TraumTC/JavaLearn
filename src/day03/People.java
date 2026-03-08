package day03;

public class People {
    private String name;
    private int age;
    private String gender;

    public People() {
        System.out.println("People类进行了一次无参构造");
    }

    public People(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
