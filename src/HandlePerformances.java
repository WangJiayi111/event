import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HandlePerformances {
    Queue<Performance> performances=new LinkedList<>();
    Scanner input=new Scanner(System.in);


    public void handlePerformances(){
        int option;

        do{
            System.out.println("\n" + "Here are the performance operations available to you: " + "\n");
            System.out.println("Type 1 to add performances:" + "\n");
            System.out.println("Type 2 to display the list of performances:" + "\n");
            System.out.println("Type 3 to start the performances:" + "\n");
            System.out.println("Type 4 to QUIT:"+"\n");
            option=input.nextInt();
            input.nextLine();

            switch(option){
                case 1:
                System.out.println("How many performances would you like to add?");
                int number =input.nextInt();
                input.nextLine();
                addPerformances(number);
                break;

                case 2:
                displayPerformances();

                case 3:
                startPerformances();
                break;

                default:
                System.out.println("Invalid choice. please enter a valid choice.");


            }

        }while(option!=4);
    }

    public void addPerformances(int number){
        for(int i=0;i<number;i++){
            System.out.println("Enter the ID of the performance" +(i+1)+":");
            String performanceID=input.nextLine();
            System.out.println("Enter the name of the performance"+(i+1)+":");
            String performanceName=input.nextLine();
            System.out.println("Enter the leadname of the performance:"+(i+1)+":");
            String performanceLeadName=input.nextLine();
            
            Performance performance=new Performance(performanceID, performanceName, performanceLeadName);
            this.performances.offer(performance);
            
        

    }
}

    public void displayPerformances(){
        System.out.println("Here is the list of performances: "+ "\n"+ performances);
    }
    
    public void startPerformances(){
        System.out.println("The next performance starting is:"+ performances.poll());
    }
}
