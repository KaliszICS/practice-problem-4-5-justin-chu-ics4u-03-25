import java.util.Objects; // need for Objects.equals and Objects.hash

/**
 * represents a student with a name, age, and student #
 */
public class Student {

    private String name;
    private int age;
    private String studentNumber;

    /**
     * construct a new Student object
     *
     * @param name the name of the student
     * @param age the age of the student
     * @param studentNumber the unique student number
     */
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    // getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    // overridden methods

    /**
     * returns a string representation of the Student in the format "name, age - student number"
     */
    @Override
    public String toString() {
        return name + ", " + age + " - " + studentNumber;
    }

    /**
     * compares this Student object to another object for equality
     * two Students are considered equal if their student numbers match
     *
     * @param o the object to compare with
     * @return true if the objects are equal based on student number, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        // check if they are the exact same object
        if (this == o) return true;
        // check if the other object is null or is not a Student
        if (o == null || getClass() != o.getClass()) return false;
        // cast to Student object
        Student student = (Student) o;
        // equality check based on studentNumber
        return Objects.equals(studentNumber, student.studentNumber);
    }

    /**
     * returns a hash code value for the object
     * consistent with the equals method, the hash code is based on the student number
     */
    @Override
    public int hashCode() {
        return Objects.hash(studentNumber);
    }

}