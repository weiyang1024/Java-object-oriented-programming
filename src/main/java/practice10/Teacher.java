package practice10;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;

public class Teacher extends Person {
    private int id;
    private String name;
    private int age;
    private ArrayList<Klass> classes;

    public Teacher(int iId, String sName, int iAge, HashSet<Klass> hash_classes) {
        super(iId, sName, iAge);
        this.id = iId;
        this.name = sName;
        this.age = iAge;
        this.classes = new ArrayList<Klass>(hash_classes);
    }

    public Teacher(int iId, String sName, int iAge) {
        super(iId, sName, iAge);
        this.id = iId;
        this.name = sName;
        this.age = iAge;
    }

    public String introduce() {
        String result = super.introduce() + " I am a Teacher.";
        if (classes != null && classes.size() != 0 ){
            result = result +  " I teach Class ";
            for(int i = 0;i < classes.size() - 1;++i)
                result = result + Integer.toString(classes.get(i).getClassName())+", ";
            result = result + Integer.toString(classes.get(classes.size() - 1).getClassName())+".";
            return result;
        }
        else
            return result + " I teach No Class.";
    }

    public String introduceWith(Student student) {
        if (isTeaching(student))
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        else
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
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

    public boolean isTeaching(Student jerry) {
        if(classes == null || classes.size() == 0 )
            return false;
        for(int i = 0 ;i < classes.size();++i){
            if(classes.get(i).getClassName() == jerry.getKlass().getClassName() )
                return true;
        }
        return false;
    }

    public ArrayList<Klass> getClasses() {
        return classes;
    }
}
