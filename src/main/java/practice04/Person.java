package practice04;


public class Person {
    private String name;
    private int age;

    public Person(String sName, int iAge) {
        this.name = sName;
        this.age = iAge;
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

    public String introduce() {
        return "My name is " + name + ". I am " + Integer.toString(age) + " years old.";
    }
}
