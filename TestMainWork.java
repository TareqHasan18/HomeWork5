package CoreJava;

import java.util.*;

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

        //queue added
        Queue<Integer> que = new LinkedList<>();

        // Adds elements {99, 100, 101, 102, 103, 104,105} to queue
        for (int i=99; i<=105; i++)
            que.add(i);

        // This will Display contents of the queue.
        System.out.println("Elements of queue-"+que);

        // This will remove the head of queue.
        int removedele = que.remove();
        System.out.println("removed element-" + removedele);

        System.out.println(que);

        // This will print the head of queue
        int head = que.peek();
        System.out.println("head of queue-" + head);


        // This will print the size of queue.
        int size = que.size();
        System.out.println("Size of queue-" + size);



        /* Creating ArrayList of type "String" which means
         * we can only add "String" elements
         */
        ArrayList<String> obj = new ArrayList<String>();

        /*This is how we add elements to an ArrayList*/
        obj.add("Riad");
        obj.add("Hasan");
        obj.add("Rifat");
        obj.add("Abby");
        obj.add("Tofael");
        obj.add("Shams");
        obj.add("Tareq");


        obj.add(3, "Ahmed");


        //Remove elements from ArrayList like this
        obj.remove("Tareq"); //Removes "Tareq" from ArrayList



        //Remove element from the specified index
        obj.remove(1); //Removes Second element from the List

        // Displaying elements
        System.out.println("Final ArrayList:");
        for(String str:obj)
            System.out.println(str);


        //handle exception added
        try {
            int a [] = {8, 6 , 4, 7};
            //int a[] = new int[4];
            System.out.println("Access element three :" + a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");


    }
}
