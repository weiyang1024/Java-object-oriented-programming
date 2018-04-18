package practice11;

import java.util.ArrayList;

public class Klass {
    private int className;
    private Student leader;
    private ArrayList<Integer> studentId;

    public Klass(int iName) {
        this.className = iName;
        studentId = new ArrayList<>();
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }

    public int getNumber() {
        return className;
    }

    public String getDisplayName() {
        return "Class " + Integer.toString(className);
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader) {
        if (studentId != null && studentId.contains(leader.getId())) {
            this.leader = leader;
            System.out.print("I am Tom. I know Jerry become Leader of Class 2.\n");
        }
        else
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student student) {
        studentId.add(student.getId());
        System.out.print("I am Tom. I know Jerry has joined Class 2.\n");
    }
}
