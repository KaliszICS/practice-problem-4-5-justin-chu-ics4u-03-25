import java.util.Objects; // need for Objects.equals and Objects.hash

/**
 * represents a Cow with a name, age, and weight
 */
public class Cow {

    private String name;
    private int age;
    private double weight; // double because weight can be decimal

    /**
     * constructs a new Cow object
     *
     * @param name the name of the cow
     * @param age the age of the cow
     * @param weight the weight of the cow
     */
    public Cow(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    // overridden methods

    /**
     * returns a string representation of the Cow in the format "name, age - weight"
     */
    @Override
    public String toString() {
        return name + ", " + age + " - " + weight;
    }

    /**
     * compares this Cow object to another object for equality
     * two Cows are considered equal if their name, age, & weight all match
     * using Double.compare for weight comparison to handle floating-point stuff.
     *
     * @param o the object to compare with
     * @return true if the objects are equal based on name, age, and weight, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        // check if they are the exact same object
        if (this == o) return true;
        // check if object null or not a Cow
        if (o == null || getClass() != o.getClass()) return false;
        // cast to Cow object
        Cow cow = (Cow) o;
        // equality check based on age, weight, and name
        return age == cow.age &&
                Double.compare(weight, cow.weight) == 0 && // compare the doubles
                Objects.equals(name, cow.name); // handle potential null names
    }

    /**
     * returns a hash code value for the object
     * consistent with the equals method, the hash code is based on name, age, and weight
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

}