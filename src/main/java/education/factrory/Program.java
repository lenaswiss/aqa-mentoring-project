package education.factrory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory factory = createDeveloperBySpecialty("php");
        Developer developer = factory.createDeveloper();

        developer.wrightCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown.");
        }
    }
}
