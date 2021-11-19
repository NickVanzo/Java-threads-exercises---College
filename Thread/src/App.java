import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Step firstStep = new Step("PRIMO", new ArrayList<Step>(), 2000);
        ArrayList<Step> previousSteps234 = new ArrayList<>();
        previousSteps234.add(firstStep);
        Step second_step = new Step("SECONDO", previousSteps234, 15000);
        Step third_step = new Step("TERZO", previousSteps234, 5000);
        Step fourth_step = new Step("QUARTO", previousSteps234, 10000);

        ArrayList<Step> previousSteps5 = new ArrayList<>();
        previousSteps5.add(second_step);
        previousSteps5.add(third_step);
        previousSteps5.add(fourth_step);
        Step fifth_step = new Step("QUINTO", previousSteps5, 4000);

        ArrayList<Step> previousSteps6 = new ArrayList<>();
        previousSteps6.add(fifth_step);
        Step last_step = new Step("SESTO", previousSteps6, 3000);

        firstStep.start();
        second_step.start();
        third_step.start();
        fourth_step.start();
        fifth_step.start();
        last_step.start();
    }
}


