package CoreJava;

public class MainWork {

    //all valid change is appreciable.

    //static variables
    static int AIage;
    static int AIid;
    static String AIname;
    static String AIintelligence;
    private static String AI = "We are AI coming to cooperate human being not to overtake" +
            " them";

    //static method;
    static void disp(){
        System.out.println("AI Name is: " +AIname);
        System.out.println("AI Age is: " +AIage);
        System.out.println("AI ID is: " +AIid);
        System.out.println("AI Intelligence is: " +AIintelligence);
    }

    static class NestedClass{
        void display(){
            System.out.println("Moto of AI: " + AI);
        }
    }
    static class speedOfPrime{
        void display(){
            System.out.println("Speed of Optimus Prime is: " + speedOfPrime);
        }
    }

    static class speedOfBumbleBee{
        void display(){
            System.out.println("Speed of Optimus Prime is: " + speedOfBumbleBee);
        }
    }

    static void OptimusPrime(){
        int AI = 1;
        for (AI = 1; AI <= 5; AI++ ){
            System.out.println("Optimus Prime " +AI);
        }

    }

    static void BumbleBee(){
        int BEE = 1;
        while (BEE <= 5){
            System.out.println("Bumble Bee " +BEE);
            BEE++;
        }
    }







}
