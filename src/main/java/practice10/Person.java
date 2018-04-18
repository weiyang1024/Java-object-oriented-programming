package practice10;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int iId,String sName, int iAge) {
        this.id = iId;
        this.name = sName;
        this.age = iAge;
    }

    public boolean isEqualTo(Person person){
        if(id == person.getId())
            return true;
        else
            return false;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
