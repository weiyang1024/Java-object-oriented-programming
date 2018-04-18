package practice06;

public class Student extends Person {
    private int klass;
    private String name;
    private int age;

    public Student(String sName, int iAge, int iKlass) {
        super(sName, iAge);
        this.name = sName;
        this.age = iAge;
        this.klass = iKlass;

    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + Integer.toString(klass) + ".";
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
