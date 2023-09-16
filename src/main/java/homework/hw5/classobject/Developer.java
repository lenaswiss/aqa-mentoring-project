package homework.hw5.classobject;

import java.util.Objects;

public class Developer {

    private static int id = 0;
    int age;
    String name;
    boolean isWorking;
    double salary;

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
        id++;
    }

    public Developer() {
        super();
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return age == developer.age && isWorking == developer.isWorking && Double.compare(developer.salary, salary) == 0 && Objects.equals(name, developer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, isWorking, salary);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isWorking=" + isWorking +
                ", salary=" + salary +
                '}';
    }


}
