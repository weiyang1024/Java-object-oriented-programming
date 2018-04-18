package practice07;

public class Student extends Person {
    private Klass klass;
    private String name;
    private int age;

    public Student(String sName, int iAge,  Klass oKlass) {
        super(sName, iAge);
        this.name = sName;
        this.age = iAge;
        this.klass = oKlass;

    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + Integer.toString(klass.getClassName()) + ".";
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
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
