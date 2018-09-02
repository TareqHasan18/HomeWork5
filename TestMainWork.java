package CoreJava;

public class TestMainWork {
    public static void main(String[] args) {

        MainWork.AIname = "Optimus Prime";
        MainWork.AIage = 166;
        MainWork.AIid = 10;
        MainWork.AIintelligence = "Outstanding";


        MainWork.AIname = "Bumble Bee";
        MainWork.AIage = 109;
        MainWork.AIid = 19;
        MainWork.AIintelligence = "very good";

        MainWork.disp();
        System.out.println("------------------------------");
        MainWork.disp();

        MainWork.NestedClass AI = new MainWork.NestedClass();
        AI.display();
        MainWork.speedOfPrime prime = new MainWork.speedOfPrime();
        prime.display();
        MainWork.speedOfBumbleBee bee = new MainWork.speedOfBumbleBee();
        bee.display();
        MainWork.OptimusPrime();
        MainWork.BumbleBee(); //latest
        MainWork.Megatron();

        Stack<String> stack = new Stack<>();
        stack.push("Optimus");
        stack.push("Bee");
        stack.push("Megatron");
        stack.push("Alphatron");

        System.out.println(stack.peek()+ " is among The transformers.");

    }
}
