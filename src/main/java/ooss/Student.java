package ooss;

public class Student extends Person {
    private String name;
    private int klass;
    private boolean isLeader= false;
    public Student(int id, String name, int age) {
        super(id,name,age);
        this.name = name;
    }
    public String introduce(){
        String msg = "My name is "+super.name+". I am "+super.age+" years old. "
                + "I am a student.";
        if(klass != 0){
            if(isLeader == true){
                msg += " I am the leader of class "+klass+".";
            }
            else {
                msg += " I am in class " + klass + ".";
            }
        }
        return msg;
    }

    public boolean isIn(Klass klass) {
        return this.klass == klass.getNumber();
    }

    public void join(Klass klass) {
        this.klass = klass.getNumber();
    }
    public int getKlass() {
        return klass;
    }

    public String getName() {
        return name;
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }
}
