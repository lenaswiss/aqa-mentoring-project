package education;

import homework.hw5.HiddenMethod;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;

public class HashCodeTest {

    protected static int instanceCounter;
    int id;
    String name;

    public HashCodeTest(String name) {
        instanceCounter++;
        this.id = instanceCounter;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCodeTest that = (HashCodeTest) o;
        return  Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name);
    }

    @Override
    public String toString() {
        return "HashCodeTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HashCodeTest hashCodeTest1 = new HashCodeTest("Test1");
        HashCodeTest hashCodeTest2 = hashCodeTest1;
        HashCodeTest hashCodeTest3 = new HashCodeTest("Test3");

        System.out.println(hashCodeTest1.toString());
        System.out.println(hashCodeTest2.toString());
        System.out.println(hashCodeTest3.toString());

        System.out.println(hashCodeTest1.hashCode() + ", " + hashCodeTest2.hashCode() + ", " + hashCodeTest3.hashCode());

        System.out.println(hashCodeTest1.equals(hashCodeTest2));
        System.out.println(hashCodeTest1.equals(hashCodeTest3));

        HashSet<HashCodeTest> hashSet = new HashSet<>();
        hashSet.add(hashCodeTest1);
        hashSet.add(hashCodeTest2);
        hashSet.add(hashCodeTest3);
        System.out.println(hashSet.size());
    }
}
