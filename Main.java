class Student implements Cloneable {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args)
            throws CloneNotSupportedException {

        Student s1 = new Student(101, "Ravi");

        Student s2 = (Student) s1.clone();

        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}