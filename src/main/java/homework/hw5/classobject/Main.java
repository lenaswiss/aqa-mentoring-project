package homework.hw5.classobject;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        JavaDeveloper javaDeveloperFirst = new JavaDeveloper("Tj Oskar", 11);
        JavaDeveloper javaDeveloper = new JavaDeveloper("Petr", 24);
        JavaDeveloper javaDeveloperCopy = new JavaDeveloper("Petr", 24);
        Developer developer = new Developer("TestDeveloper", 33);
        Developer developerJava = new JavaDeveloper("Java Developer", 25);
        System.out.println(javaDeveloper);
        System.out.println(javaDeveloper.hashCode());
        System.out.println(javaDeveloperCopy.hashCode());
        Object clone = javaDeveloperCopy.clone();
        System.out.println("clone - " + clone);
        System.out.println("original " + javaDeveloperCopy);
        System.out.println("are objects equal - " + clone.equals(javaDeveloperCopy));
        System.out.println("are objects have the same link - " + (clone == javaDeveloperCopy));
        javaDeveloperCopy.setAge(102);
        javaDeveloperCopy.setWorking(true);
        javaDeveloperCopy.setSalary(10_000);
        System.out.println("clone - " + clone);
        System.out.println("original " + javaDeveloperCopy);
    }
}
