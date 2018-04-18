package practice07;

public class Teacher extends Person {
    private Klass klass ;
    private String name;
    private int age;

    public Teacher(String sName, int iAge, Klass oKlass) {
        super(sName, iAge);
        this.name = sName;
        this.age = iAge;
        this.klass = oKlass;
    }

    public Teacher(String sName, int iAge) {
        super(sName, iAge);
        this.name = sName;
        this.age = iAge;
    }

    public String introduce() {
        String result = super.introduce() + " I am a Teacher.";
        if (klass != null)
            return result + " I teach Class " + Integer.toString(klass.getClassName()) + ".";
        else
            return result + " I teach No Class.";
    }

    public String introduceWith(Student student){
        if(klass.getClassName() == student.getKlass().getClassName())
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        else
            return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
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
