package CoreJava;

import java.util.Scanner;

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

        System.out.println("Transformers stack contains" +stack);
        System.out.println(stack.peek()+ " is among The transformers.");

        //added scanner
        Scanner trans = new Scanner(System.in);
        System.out.println("pls enter the numbers: ");
        int strength1 = trans.nextInt(), strength2 = trans.nextInt();
        if (strength1 > strength2){
            System.out.println("optimus is stronger than megatron");
        }else if (strength2 > strength1){
            System.out.println("megatron is stronger than optimus");
        }else {
            System.out.println("both are equally strong");
        }

        //exception handle method
        MainWork.exceptionhandle();

    }
}
