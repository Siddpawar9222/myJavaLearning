package L_CollectionFramework.MySet;

import java.util.Objects;

public class Student {
    String name;
    int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return name + " " + "  " + roll_no + "  ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student simpson = (Student) o;
        return roll_no == simpson.roll_no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll_no);
    }

}

/*
 * If you want to represent any object as a string, toString() method used
 * without override toString method hashcode values of the objects will execute
 * but I want to print the values of these objects. Since Java compiler
 * internally calls toString() method, overriding this method will return the
 * specified values.
 * 
 */