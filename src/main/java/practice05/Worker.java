package practice05;

public class Worker extends Person {
    private String name;
    private int age;

    public Worker(String sName, int iAge) {
        super(sName, iAge);
        this.name = sName;
        this.age = iAge;

    }

    public String introduce() {
        return super.introduce() + " I am a Worker. I have a job.";
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
