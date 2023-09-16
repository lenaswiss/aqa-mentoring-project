package education.decorator.exampletwo;

public class Main {

    public static void main(String[] args) {
        Developer javaSeniorDeveloper = new SeniorJavaDeveloper(new JavaDeveloper());
        makeDeveloperJob(javaSeniorDeveloper);

        for (int i = 0; i < 40; i++) {
            System.out.print("=");
        }
        System.out.println();

        Developer javaTeamLead = new JavaTeamLead(javaSeniorDeveloper);
        makeDeveloperJob(javaTeamLead);
    }

    private static void makeDeveloperJob(Developer developer){
        System.out.println(developer.getClass().getSimpleName()+ " :\n" + developer.makeJob());
    }
}
