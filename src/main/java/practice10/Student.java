package practice10;

public class Student extends Person {
    private int id;
    private Klass klass;
    private String name;
    private int age;

    public Student(int iId, String sName, int iAge, Klass oKlass) {
        super(iId, sName, iAge);
        this.id = iId;
        this.name = sName;
        this.age = iAge;
        this.klass = oKlass;

    }

    public String introduce() {
        if (klass.getLeader() != null && klass.getLeader().getId() == id)
            return super.introduce() + " I am a Student. I am Leader of Class " + Integer.toString(klass.getClassName()) + ".";
        else
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

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
