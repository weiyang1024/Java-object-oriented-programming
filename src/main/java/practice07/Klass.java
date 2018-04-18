package practice07;

public class Klass {
    private int className;

    public Klass(int iName){
        this.className = iName;
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
}
