package education.decorator.exampletwo;

public class JavaTeamLead  extends DeveloperDecorator{

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + "\n" + sendWeekReport();
    }

    private String sendWeekReport() {
        return "Send week report to customer.";
    }
}
