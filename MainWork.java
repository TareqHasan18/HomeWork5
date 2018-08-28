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





}
