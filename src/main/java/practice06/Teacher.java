package practice06;

public class Teacher extends Person {
    private int klass ;
    private String name;
    private int age;

    public Teacher(String sName, int iAge, int iKlass) {
        super(sName, iAge);
        this.name = sName;
        this.age = iAge;
        this.klass = iKlass;
    }

    public Teacher(String sName, int iAge) {
        super(sName, iAge);
        this.name = sName;
        this.age = iAge;
    }

    public String introduce() {
        String result = super.introduce() + " I am a Teacher.";
        if (klass != 0)
            return result + " I teach Class " + Integer.toString(klass) + ".";
        else
            return result + " I teach No Class.";
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
