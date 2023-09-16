package homework.hw5.classobject;

import java.util.Objects;

public class JavaDeveloper extends Developer implements Cloneable {
    int userId;

    public JavaDeveloper(String name, int age) {
        super(name, age);
        this.userId = super.getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JavaDeveloper that = (JavaDeveloper) o;
        return userId == that.userId;
    }

    @Override
    protected Object     clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), userId);
    }

    @Override
    public String toString() {
        return "JavaDeveloper{" +
                "ID=" + userId +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", isWorking=" + isWorking +
                ", salary=" + salary +
                '}';
    }
}
